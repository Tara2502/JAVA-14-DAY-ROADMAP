package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        // Creating a FileWriter object for notes.txt.
// The second parameter is true, which enables append mode.
// Existing data remains in the file.
// If this parameter is omitted, FileWriter overwrites the existing content.
        FileWriter writer=new FileWriter("notes.txt",true);
        //write method is used to write the provided data in the file
        writer.write("hello my name is tara,im learning file writer today");
        //closing writer is important so that the sources are realead and can be used for other operation
//        Any buffered data waiting in memory is written to the file before closing.
//So close() has two jobs:
//Release system resources.
//Ensure all pending data is written.
        writer.close();
    }
}
