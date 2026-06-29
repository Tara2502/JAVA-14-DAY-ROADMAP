package expensetracker.service;

import expensetracker.model.Expense;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExpenseTrackerService {
    private List<Expense> expenses=new ArrayList<>();
    public void addExpense(Expense expense){
        if(expense==null){
            throw new IllegalArgumentException("Expense cannot be null");
        }
        expenses.add(expense);
    }
    public void displayAllExpenses(){
        expenses.forEach(System.out::println);
    }
    public double getTotalExpense(){
        return expenses.stream()
                .map(Expense::getAmount)
                .reduce(0.0,Double::sum);
    }
    public List<Expense> getExpensesByCategory(String category){
        return expenses.stream()
                .filter(expense->expense.getCategory().equalsIgnoreCase(category))
                .toList();
    }
    public Map<String,List<Expense>> groupExpensesByCategory(){
return expenses.stream().
        collect(Collectors.groupingBy(Expense::getCategory));
    }
    public List<Expense> getExpensesSortedByAmount(){
        return expenses.stream()
                .sorted(Comparator.comparingDouble(Expense::getAmount))
                .toList();
    }
    public double getMonthlyExpense(String month){
        return expenses.stream()
                .filter(expense -> expense.getMonth().equalsIgnoreCase(month))
                .map(Expense::getAmount)
                .reduce(0.0,Double::sum);
    }
    public Expense getHighestExpense(){
        return expenses.stream()
                .max(Comparator.comparingDouble(Expense::getAmount))
                .orElse(null);
    }
}
