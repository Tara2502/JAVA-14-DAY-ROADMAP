package exceptions;

public class ThrowDemo1 {
    public static void main(String[] args) {
        int marks=120;
        if(marks<0 || marks>100){
            throw new IllegalArgumentException("marks should be between 0 to 100.");
        }
            System.out.println("valid marks");

    }
}
//marks = 120
//        │
//        ▼
//marks < 0 || marks > 100
//        │
//        ▼
//        true
//        │
//        ▼
//        throw new IllegalArgumentException(...)
//      │
//              ▼
//Program terminates
