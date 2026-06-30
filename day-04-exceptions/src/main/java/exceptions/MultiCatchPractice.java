package exceptions;

public class MultiCatchPractice {
    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            String name = null;

            System.out.println(name.length());

        } catch (ArithmeticException | NullPointerException e) {

            System.out.println("Handled.");

        }

    }}
