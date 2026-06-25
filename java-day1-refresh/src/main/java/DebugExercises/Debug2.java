package DebugExercises;

public class Debug2 {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
/*
what did we use :- Breakpoint + Step Over + checking variable values
* which line fails?
* ans- System.out.println(name.length());will fail .
* why it fails?
* ans- beacuse the string value is null . but null does not refer to any actual string object  so java cannot call length() on it
*What exception occurs?
ans- NullPointerException.
 */