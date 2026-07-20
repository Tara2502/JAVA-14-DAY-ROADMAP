package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.model.Student;

import java.io.File;
import java.io.IOException;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        Student student=mapper.readValue(new File("student.json"), Student.class);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCity());

    }
}
