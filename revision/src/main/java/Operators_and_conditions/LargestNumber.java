package Operators_and_conditions;

public class LargestNumber {
    public static void main(String[] args) {
        int a=10,b=30,c=0;
        if(a>b && a>c){
            System.out.println(a+" is largest");
        } else if (b>c && b>a) {
            System.out.println(b+" is largest");
        }else {
            System.out.println(c+" is largest");
        }
    }
}
