package DebugExercises;

public class Debug1 {

        public static void main(String[] args) {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println(result);
        }
    }
    /*
    * where exception occurs?
    * ans- exception occurs at this line while executing it - int result =a/b;
    * what exception occurs?
    * ans- ArithmeticException.
    * why it happens?
    * ans- beacuse the value of b is 0 ;
    * */

