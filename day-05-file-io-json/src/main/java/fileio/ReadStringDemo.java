package fileio;

import javax.xml.crypto.dsig.spec.XPathFilterParameterSpec;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadStringDemo {
    public static void main(String[] args) {
        Path path = Paths.get("notes.txt");
        String content= null;
        try {
            content = Files.readString(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(content);
    }
}
