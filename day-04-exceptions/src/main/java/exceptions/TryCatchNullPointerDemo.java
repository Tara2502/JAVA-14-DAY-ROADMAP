package exceptions;

public class TryCatchNullPointerDemo {
    public static void main(String[] args) {
        try{
            String name=null;
            System.out.println("program started");
            System.out.println(name.length());
        }catch (NullPointerException e){
            System.out.println("name cannot be null");
        }
// This line executes after the try-catch finishes.
        System.out.println("Program Ended");

    }
}
