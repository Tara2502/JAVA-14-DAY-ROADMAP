package PracticeProblems;

public class Fibonacci {
    public static void main(String[] args) {
        int num=3;
        int a=0;
        int b=1;
        if(num>=1){
            System.out.println(a+" ");
        }
        if(num>=2){
            System.out.println(b+" ");
        }
        for(int i=3;i<=num;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }

}
