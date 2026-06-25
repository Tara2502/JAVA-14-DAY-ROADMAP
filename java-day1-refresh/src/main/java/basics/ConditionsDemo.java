package basics;

public class ConditionsDemo {
    public static void main(String[] args) {
        int marks = 82;
        if(marks>=90){
            System.out.println("grade A");
        } else if(marks>=75) {
            System.out.println("grade B");
        } else if(marks>=50) {
            System.out.println("grade C");
        }else{
            System.out.println("Fail");
        }
    }
}
