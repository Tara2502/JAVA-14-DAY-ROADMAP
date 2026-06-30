package exceptions.custom;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        int age =-5;
        if(age<0){
            throw new InvalidAgeException("age cannot be negative");
        }
        System.out.println("Valid Age");
    }
}
