package exceptions;

public class ExpenseValidationException extends RuntimeException {

    public ExpenseValidationException(String message) {
        super(message);
    }
}
