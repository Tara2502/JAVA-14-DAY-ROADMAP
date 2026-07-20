package exceptions;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] numbers={10,20,40};
        System.out.println(numbers[6]);
    }


}
/*
* Why does the exception occur?
* ans: The array contains only three elements.
Index 6 is outside the valid range, so the JVM throws an ArrayIndexOutOfBoundsException.
What is the valid index range?
* ans: valid range is 0 to 2.
* */
