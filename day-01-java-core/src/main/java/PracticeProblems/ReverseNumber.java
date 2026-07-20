package PracticeProblems;

public class ReverseNumber {
    public static void main(String[] args) {
        int num=786;
        int rev=0;
        while(num>0){
            int digit=num%10;
            num=num/10;
            rev=rev*10+digit;
        }
        System.out.println(rev);

    }
}
