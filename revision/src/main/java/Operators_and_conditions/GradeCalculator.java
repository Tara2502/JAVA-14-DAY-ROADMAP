package Operators_and_conditions;

public class GradeCalculator {
    public static void main(String[] args) {
        int marks=-1;
        if(marks>100 || marks<0){
            System.out.println("marks must be between 0 to 100.");
        }
        if(marks>=90 && marks<=100){
            System.out.println("grade: "+"A");
        } else if (marks>=80 && marks<=89) {
            System.out.println("grade: "+"B");
        }else if (marks>=70 && marks<=79) {
            System.out.println("grade: "+"C");
        }else if (marks>=60 && marks<=69) {
            System.out.println("grade: "+"B");
        }else if(marks<60 && marks>=0){
            System.out.println("Fail");
        }
    }
}
