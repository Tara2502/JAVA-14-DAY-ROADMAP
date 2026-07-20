package fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLinesDemo {
    public static void main(String[] args) throws  IOException{
        // Creating a Path object that represents the location of notes.txt.
        // It does not create the file; it only stores its location.
        Path path = Paths.get("notes.txt");
        List<String> items;

        // readAllLines() returns a List<String>.
// Each line in the file becomes one element in the list.
// The return type is List (an interface), not ArrayList,
// because Java programs to interfaces.
            items = Files.readAllLines(path);

        //print list
        for (String i : items) {
            System.out.println(i);
        }

    }
}
