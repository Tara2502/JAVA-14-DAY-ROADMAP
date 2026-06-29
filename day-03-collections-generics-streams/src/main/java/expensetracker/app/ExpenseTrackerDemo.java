package expensetracker.app;

import expensetracker.model.Expense;
import expensetracker.service.ExpenseTrackerService;

public class ExpenseTrackerDemo {
    public static void main(String[] args) {
        ExpenseTrackerService service=new ExpenseTrackerService();
        service.addExpense(new Expense("Groceries",2500, "Food", "June"));
        service.addExpense(new Expense("Pizza",600,  "Food", "June"));
        service.addExpense(new Expense("Uber", 300, "Travel", "June"));
        service.addExpense(new Expense( "Movie", 500,"Entertainment", "July"));

        System.out.println("All Expenses:");
        service.displayAllExpenses();
        System.out.println("\nTotal Expense: "+ service.getTotalExpense());
        System.out.println("\nFood Expenses:");
        service.getExpensesByCategory("food").forEach(System.out::println);
        System.out.println("\nGrouped by Category:");
        System.out.println(service.groupExpensesByCategory());
        System.out.println("\nSorted by Amount:");
        service.getExpensesSortedByAmount().forEach(System.out::println);
        System.out.println("\nJune Expense Total: " + service.getMonthlyExpense("June"));
        System.out.println("\nHighest Expense:");
        System.out.println(service.getHighestExpense());

    }
}
