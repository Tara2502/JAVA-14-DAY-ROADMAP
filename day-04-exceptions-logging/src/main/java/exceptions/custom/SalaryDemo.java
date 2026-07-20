package exceptions.custom;

public class SalaryDemo {
    public static void main(String[] args) {
        double salary=-1000;
        if(salary<0){
            throw new InvalidSalaryException("salary cannot be negative.");
        }
    }
}
