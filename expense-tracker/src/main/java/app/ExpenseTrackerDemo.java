package app;

import exceptions.ExpenseNotFoundException;
import exceptions.ExpenseValidationException;
import exceptions.InvalidCategoryException;
import model.Expense;
import service.ExpenseTrackerService;

public class ExpenseTrackerDemo {

    public static void main(String[] args) {

        // Creating the service object
        ExpenseTrackerService service = new ExpenseTrackerService();

        try {

            // Adding expenses
            service.addExpense(new Expense("Groceries", 2500, "Food", "June"));
            service.addExpense(new Expense("Pizza", 600, "Food", "June"));
            service.addExpense(new Expense("Uber", 300, "Travel", "June"));
            service.addExpense(new Expense("Movie", 500, "Entertainment", "July"));

            System.out.println("All Expenses:");
            service.displayAllExpenses();

            System.out.println("\nTotal Expense:");
            System.out.println(service.getTotalExpense());

            System.out.println("\nFood Expenses:");
            service.getExpensesByCategory("Food")
                    .forEach(System.out::println);

            System.out.println("\nGrouped by Category:");
            System.out.println(service.groupExpensesByCategory());

            System.out.println("\nSorted by Amount:");
            service.getExpensesSortedByAmount()
                    .forEach(System.out::println);

            System.out.println("\nJune Expense Total:");
            System.out.println(service.getMonthlyExpense("June"));

            System.out.println("\nHighest Expense:");
            System.out.println(service.getHighestExpense());

        }

        // Handles validation-related errors
        catch (ExpenseValidationException e) {
            System.out.println(e.getMessage());
        }

        // Handles category-related errors
        catch (InvalidCategoryException e) {
            System.out.println(e.getMessage());
        }

        // Handles missing expense-related errors
        catch (ExpenseNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // Handles any unexpected exception

        catch (Exception e) {
            System.out.println("Unexpected error occurred.");
            e.printStackTrace();
        }

        System.out.println("\nProgram Finished.");

    }
}