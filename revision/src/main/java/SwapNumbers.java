public class SwapNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        //using third variable
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        //without third variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+" "+ b);
    }
}
