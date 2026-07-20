package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
    public static void main(String[] args) {
        Path path= Paths.get("expenses.txt");
        System.out.println("Path: " + path);
        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent: " + path.getParent());
        System.out.println("Absolute Path: " + path.toAbsolutePath());

    }


}
