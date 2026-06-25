package Library.model;

public class Person {
    protected int id;
    protected String name;
    public Person(int id, String name){
        if(id<=0){
            throw new IllegalArgumentException("id must be positive.");
        }
        if(name==null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank.");
        }
        this.id=id;
        this.name=name;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
