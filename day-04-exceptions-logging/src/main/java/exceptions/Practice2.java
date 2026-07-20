package exceptions;

public class Practice2 {
    //dont cause any exception
    public static void main(String[] args) {
        System.out.println("started");
        try{
            int result=20/5;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("exception");
        }finally{
            System.out.println("clearing out resources....");
        }
        System.out.println("ended");
    }
}
/*
* Program Started
       │
       ▼
Enter try
       │
       ▼
20 / 5
       │
       ▼
No Exception
       │
       ▼
Skip catch
       │
       ▼
finally executes
       │
       ▼
Continue
       │
       ▼
Program Ended
* */