package exceptions.custom;

public class InvalidSalaryException extends RuntimeException{
    public InvalidSalaryException(String message){
        super(message);
    }
}
