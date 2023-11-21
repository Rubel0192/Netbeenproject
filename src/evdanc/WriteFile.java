package evdanc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFile {

    public static void Write2() throws IOException {

        String up = "C:\\Users\\B-6\\Desktop\\New folder\\dd.txt";
        Path path = Paths.get(up);
        String fileContent = " " + "This is  many problem in my country";

        Files.write(path, fileContent.getBytes(), StandardOpenOption.CREATE);

    }
    
    
    
    
    
    

    public static void main(String[] args) throws IOException {
        Write2();
    }
}
