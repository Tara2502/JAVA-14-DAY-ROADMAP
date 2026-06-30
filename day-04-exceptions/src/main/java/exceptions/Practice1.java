package exceptions;

public class Practice1 {
    public static void main(String[] args) {
        //exception occurs
        System.out.println("program started ");
        try{
            int a=10;
            int b=0;
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("cannot be divided by 0");
        }finally{
            System.out.println("Clearing out resources....");
        }
        System.out.println("program ended");
    }
}
/*Flow:
* Program Started
       │
       ▼
Enter try
       │
       ▼
10 / 0
       │
       ▼
ArithmeticException
       │
       ▼
catch executes
       │
       ▼
finally executes
       │
       ▼
Continue after try-catch-finally
       │
       ▼
Program Ended
* */
