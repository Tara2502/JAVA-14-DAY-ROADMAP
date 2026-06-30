package model;

public class Expense {
    private String title;
    private double amount;
    private String category;
    private String month;

    public Expense(
            String title,
            double amount,
            String category,
            String month
    ) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be blank");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Category cannot be blank");
        }
        if (month == null || month.isBlank()) {
            throw new IllegalArgumentException("Month cannot be blank");
        }
        this.amount = amount;
        this.title = title;
        this.category = category;
        this.month = month;
    }

    public String getTitle() {
        return title;
    }

    public double getAmount() {
        return amount;
    }

    public String getCategory() {
        return category;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "title='" + title + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
