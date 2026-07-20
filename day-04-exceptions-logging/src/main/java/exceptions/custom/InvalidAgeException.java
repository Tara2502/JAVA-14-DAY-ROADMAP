package exceptions.custom;
// Our custom exception class.
// It extends RuntimeException,
// making it an unchecked exception.
public class InvalidAgeException extends RuntimeException{
    //constructor that accepts the error message
    public InvalidAgeException(String message){
        /// /pass every message to the parent class
        super(message);

    }
}
