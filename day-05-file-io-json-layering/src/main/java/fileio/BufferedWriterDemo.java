package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        //BufferedWriter Wraps the FileWriter because it internally uses it
        // BufferedWriter first stores data in an internal buffer (RAM).
// The buffered data is written to the file when:
// 1. The buffer becomes full,
// 2. flush() is called,
// 3. close() is called.
        BufferedWriter writer=new BufferedWriter(new FileWriter("notes.txt"));
        writer.write("Java");
        //newLine works for every operating system automatically no need to change it manually
        //example-> for windows:\n ,for linux its something else
        writer.newLine();
        writer.write("SpringBoot");
        writer.newLine();
        //writes the data to the file present in the RAM or buffer memory
        writer.flush();
        writer.write("Hibernate");
        writer.newLine();
        writer.write("Docker");
        writer.newLine();
        writer.flush();
        //neccesarry to release any remaining sources and for final flush
        writer.close();

    }
}
