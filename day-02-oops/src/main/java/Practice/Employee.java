package Practice;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeId,String employeeName,double employeeSalary){
        if (employeeId <= 0) {
            throw new IllegalArgumentException("Employee ID must be positive");
        }
        if (employeeName == null || employeeName.isBlank()) {
            throw new IllegalArgumentException("Employee name cannot be blank");
        }
        if (employeeSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
         this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.employeeSalary=employeeSalary;

    }
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }
}
