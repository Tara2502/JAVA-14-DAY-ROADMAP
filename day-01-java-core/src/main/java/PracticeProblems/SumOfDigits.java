package PracticeProblems;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=121;
        int sum=0;
        while(num>0){
           int digit=num%10;  //1st iteration digits=1
            num=num/10;         //removing the last digit
           sum+=digit;        //sum=0+1=1

        }
        System.out.println(sum);
    }
}
