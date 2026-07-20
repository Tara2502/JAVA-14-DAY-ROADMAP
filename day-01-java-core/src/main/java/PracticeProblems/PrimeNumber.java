package PracticeProblems;

public class PrimeNumber {
    public static void main(String[] args) {
        int num=2;
       boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }else{
            int i=2;
            while(i*i<=num){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
        }

        if(isPrime){
            System.out.println("is a prime no.");
        }else {
            System.out.println("is not a prime no.");
        }
    }
}
