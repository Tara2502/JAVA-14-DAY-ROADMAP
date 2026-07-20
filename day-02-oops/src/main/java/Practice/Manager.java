package Practice;

public class Manager extends Employee {
    private String department;

    public Manager(int employeeId, String employeeName, double employeeSalary,String department) {
        super(employeeId, employeeName, employeeSalary);
        if(department==null ||department.isBlank()){
            throw new IllegalArgumentException("Please specify the department");
        }
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
    public void displayManagerInfo(){
        displayEmployeeInfo();
        System.out.println("Department: "+department);
    }
}
