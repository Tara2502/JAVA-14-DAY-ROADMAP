package exceptions;


public class MultipleCatchDemo {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            // Change this variable to test
            // different exceptions.
            int option = 1;

            if (option == 1) {

                // Throws ArithmeticException
                int result = 10 / 0;

            } else if (option == 2) {

                // Throws NullPointerException
                String name = null;
                System.out.println(name.length());

            } else {

                // Throws ArrayIndexOutOfBoundsException
                int[] numbers = {10, 20};

                System.out.println(numbers[5]);
            }

        }

        catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception Handled.");

        }

        catch (NullPointerException e) {

            System.out.println("Null Pointer Exception Handled.");

        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array Index Exception Handled.");

        }

        catch (Exception e) {

            // This is a generic catch block.
            // It handles any remaining exceptions
            // not handled above.
            System.out.println("Some Other Exception Occurred.");

        }

        System.out.println("Program Ended");

    }

}
