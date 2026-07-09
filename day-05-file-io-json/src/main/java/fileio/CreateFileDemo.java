package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileDemo {
    public static void main(String[] args) {


    Path path= Paths.get("expenses.txt");
    boolean exists= Files.exists(path);
    if(!exists) {
        try {
            Files.createFile(path);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        }else{
        System.out.println("file already exists");
    }
    }
}
