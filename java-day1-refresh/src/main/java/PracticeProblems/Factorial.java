package PracticeProblems;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int i=1;
        int fact=1;
        while(i<=num){
            fact *=i;
            i++;
        }
        System.out.println("factorial of "+ num +" is: "+ fact);
    }
}
