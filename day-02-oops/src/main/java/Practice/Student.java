package Practice;

public class Student {
    private int id;
    private String name;
    private int marks;
    public Student(int id,String name,int marks){
        if(id<=0){
            throw new IllegalArgumentException("Id needs to be positive");
        }
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be null");
        }
        if(marks<0 || marks>100){
            throw new IllegalArgumentException("marks needs to be between 0 to 100");
        }
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

}
