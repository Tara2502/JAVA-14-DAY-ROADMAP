package exceptions;

public class ThrowDemo2 {
    public static void main(String[] args) {
        double salary=-1000;
        if(salary<0){
            throw new IllegalArgumentException("salary cannot be negative.");
        }else {
            System.out.println("proper salary");
        }

    }
}
