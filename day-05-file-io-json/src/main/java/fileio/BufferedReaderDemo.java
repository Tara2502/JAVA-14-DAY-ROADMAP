package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

    public static void main(String[] args) throws IOException {

        // FileReader reads characters from the file.
        FileReader fileReader = new FileReader("notes.txt");

        // BufferedReader wraps FileReader to improve performance
        // by reading data into a buffer.
        BufferedReader reader = new BufferedReader(fileReader);

        // Stores one line from the file.
        String data;

        // Read one line at a time until readLine() returns null.
        while ((data = reader.readLine()) != null) {

            // Print the current line.
            System.out.println(data);
        }

        // Close the reader to release system resources.
        reader.close();
    }
}