package exceptions;

public class TryCatchArithmeticDemo {
    public static void main(String[] args) {
        try{
            int number=10;
            int divisor=0;
            System.out.println("program started");
            int answer=number/divisor;
            System.out.println(answer);

        } catch (ArithmeticException e) {
            System.out.println("cannot be divided by 0.");
        }
        // This line executes after the try-catch finishes.
        System.out.println("Program Ended");
    }

}
