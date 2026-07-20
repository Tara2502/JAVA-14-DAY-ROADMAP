package PracticeProblems;

public class Palindrome {
    public static void main(String[] args) {
        int num=121;
        int temp=num;
        int rev=0;

        while(temp >0){
            int digit= temp %10;
             temp = temp /10;
            rev=rev*10+digit;
        }
        if(rev==num){
            System.out.println("number is palindrome");
        }else {
            System.out.println("is not a palindrome number");
        }
    }
}
