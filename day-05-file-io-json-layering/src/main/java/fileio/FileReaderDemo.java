package fileio;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReaderDemo {

    public static void main(String[] args) throws IOException {

        // Create a Path object representing the file location.
        Path path = Paths.get("notes.txt");

        // Create a FileReader to read characters from the file.
        FileReader reader = new FileReader(path.toFile());

        // Stores the Unicode value of each character.
        // int is used because read() returns -1 at the end of the file.
        int data;

        // Read one character at a time until the end of the file.
        while ((data = reader.read()) != -1) {

            // Convert the Unicode value into a character.
            System.out.print((char) data);
        }

        // Close the file to release system resources.
        reader.close();
    }
}