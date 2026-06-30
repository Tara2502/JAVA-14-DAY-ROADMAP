package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionDemo {
    public static void readFile() throws IOException {
FileReader fileReader=new FileReader("data.txt");
        System.out.println("file opened successfully");
        fileReader.close();
    }

    public static void main(String[] args) throws IOException{
        readFile();
        System.out.println("program ended");
    }
}
