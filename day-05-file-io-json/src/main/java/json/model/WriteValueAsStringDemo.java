package json.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class WriteValueAsStringDemo {
    public static void main(String[] args) throws IOException {
        Student student=new Student("Tara", 26, "Mumbai");
        ObjectMapper mapper=new ObjectMapper();
        String json= mapper.writeValueAsString(student);
        System.out.println(json);
    }




}
