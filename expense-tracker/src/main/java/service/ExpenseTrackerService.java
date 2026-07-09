package service;

import exceptions.ExpenseNotFoundException;
import exceptions.InvalidCategoryException;
import model.Expense;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import repository.ExpenseRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExpenseTrackerService {
    private final ExpenseRepository repository;
    private List<Expense> expenses;
    private static final Logger logger =
            LoggerFactory.getLogger(ExpenseTrackerService.class);
    public ExpenseTrackerService() {

        repository = new ExpenseRepository();

        try {
            expenses = repository.loadExpenses();
        } catch (IOException e) {
            logger.error("Unable to load expenses.", e);
            expenses = new ArrayList<>();
        }
    }

    public void addExpense(Expense expense){
        //log before validation
        if (expense == null) {
            throw new IllegalArgumentException("Expense cannot be null.");
        }
        expenses.add(expense);
        try {
            repository.saveExpenses(expenses);
            logger.info("Expense added successfully");
        } catch (IOException e) {
           logger.error("Failed to save expense",e);
           throw new RuntimeException("Unable to save expenses.", e);
        }

    }
    public void displayAllExpenses(){
        logger.info("Displaying all expenses.");
        if(expenses.isEmpty()){
            logger.warn("Expense list is empty.");
            throw new ExpenseNotFoundException(
                    "No expenses available."
            );
        }
        expenses.forEach(System.out::println);
    }
    public double getTotalExpense(){
        logger.debug("Calculating total expense.");

        double total=expenses.stream()
                .map(Expense::getAmount)
                .reduce(0.0,Double::sum);

        logger.info("Total expense calculated successfully");
        return total;
    }
    public List<Expense> getExpensesByCategory(String category){
        logger.debug("Searching expenses for category{}", category);
        List<Expense> expenseList=expenses.stream()
                .filter(expense->expense.getCategory().equalsIgnoreCase(category))
                .toList();
        if (expenseList.isEmpty()) {

            logger.warn("Category {} not found.", category);

            throw new InvalidCategoryException(
                    "No expenses found for category: " + category
            );
        }

        logger.info("Found {} expense(s).", expenseList.size());

        return expenseList;
    }


    public Map<String,List<Expense>> groupExpensesByCategory(){
        logger.info("Grouping expenses by category.");
        Map<String, List<Expense>> grouped = expenses.stream()
                .collect(Collectors.groupingBy(Expense::getCategory));

        logger.info("Expenses grouped successfully.");

        return grouped;
    }
    public List<Expense> getExpensesSortedByAmount(){
        logger.info("Sorting expenses by amount.");
        return expenses.stream()
                .sorted(Comparator.comparingDouble(Expense::getAmount))
                .toList();
    }
    public double getMonthlyExpense(String month){
        logger.debug("Calculating expenses for month: {}", month);
        double total=expenses.stream()
                .filter(expense -> expense.getMonth().equalsIgnoreCase(month))
                .map(Expense::getAmount)
                .reduce(0.0,Double::sum);
        logger.info("Monthly expense calculated for {}", month);
        return total;
    }
    public Expense getHighestExpense(){
        logger.debug("Finding highest expense.");
        Expense highest=expenses.stream()
                .max(Comparator.comparingDouble(Expense::getAmount))
                .orElseThrow(() ->
                new ExpenseNotFoundException(
                        "No expenses available."
                ));
            logger.info("Highest expense is {}", highest.getTitle());

        return highest;

    }
}

