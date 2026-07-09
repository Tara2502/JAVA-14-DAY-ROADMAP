package fileio;

import java.io.*;
import java.nio.channels.ScatteringByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class StudentNotesManager {
    public static void main(String[] args) throws IOException {
        Path path= Paths.get("notes.txt");
        String note;
        if(!Files.exists(path)){
            Files.createFile(path);
        }
       try( Scanner sc = new Scanner(System.in);
               BufferedWriter writer=new BufferedWriter(
                       new FileWriter("notes.txt",true));){

           for (int i = 1; i <= 3; i++) {
               System.out.print("Enter Note " + i + ": ");
               note = sc.nextLine();
               writer.write(note);
               writer.newLine();
           }
           writer.flush();
       }
       try(BufferedReader reader=new BufferedReader(
               new FileReader("notes.txt"))){
           System.out.println("-------All Notes--------");
           String data;
           while((data= reader.readLine())!=null){
               System.out.println(data);
           }
       }
    }
}
