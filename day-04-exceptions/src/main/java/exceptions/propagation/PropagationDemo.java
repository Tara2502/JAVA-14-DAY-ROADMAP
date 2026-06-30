package exceptions.propagation;

public class PropagationDemo {
    public static void methodC(){
        System.out.println("Inside methodC");
        //this line throws Arithmetic exception
        int result=10/0;
        System.out.println("Leaving methodC");
    }
    public static void methodB(){
        System.out.println("Inside methodB");
        //calling method c
        methodC();
        System.out.println("Leaving methodB");
    }
    public static void methodA(){
        System.out.println("Inside methodA");
        //calling method b
        methodB();
        System.out.println("Leaving methodA");
    }

    public static void main(String[] args) {
        System.out.println("Program Started");
        try{
            methodA();
        } catch (ArithmeticException e) {
            System.out.println("cannot divide by 0;");
        }

        System.out.println("Program Ended");
    }
}
