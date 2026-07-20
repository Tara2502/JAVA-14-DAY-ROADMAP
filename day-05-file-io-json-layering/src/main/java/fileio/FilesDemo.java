package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {
    public static void main(String[] args) {
        Path path= Paths.get("expenses.txt");
        boolean exists= Files.exists(path);
        System.out.println("file exists? "+path);
    }
}
