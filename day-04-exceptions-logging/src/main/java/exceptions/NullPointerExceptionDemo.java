package exceptions;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String name=null;
        System.out.println(name.length());
    }
}

/*
* Why does the exception occur?
* ans: name does not refer to any String object. It contains null.
Calling length() requires an actual String object,
so the JVM throws a NullPointerException.
Which object reference is null?
* ans: name.
* */
