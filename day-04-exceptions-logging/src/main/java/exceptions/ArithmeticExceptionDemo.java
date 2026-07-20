package exceptions;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int number=10;
        int divisor =0;
        System.out.println("program started");
        int output =number/ divisor;
        System.out.println(output);
        System.out.println("program ended");
    }

}

/*
* Which line throws the exception?
* ans:   int output =number/ divisor;
What is the exception name?
* ans: ArithmeticException
Why doesn't "Program Ended" print?
* ans: Division by zero causes the JVM to throw an ArithmeticException.
Since the exception is not handled, the JVM terminates the current method immediately,
 so "Program Ended" is never executed.
* */