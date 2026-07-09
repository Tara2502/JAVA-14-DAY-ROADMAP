package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.model.Student;

import java.io.File;
import java.io.IOException;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        //create student obj
        Student student=new Student("Tara", 26, "Mumbai");
        //create obj mapper
        ObjectMapper mapper=new ObjectMapper();
        //convert java obj into json
        mapper.writeValue(new File("student.json"),student);
        System.out.println("student saved successfully");
    }
}
