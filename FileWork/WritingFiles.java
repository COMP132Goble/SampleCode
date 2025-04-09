package FileWork;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class WritingFiles {
    public static void main(String[] args) {
        try {
            // First I'll create a file
            File targetFile = new File("./FileWork/sample.txt");
            if (!targetFile.exists()) {
                targetFile.createNewFile();
            }
            
            // then I'll start writing to it
            FileWriter myWriter = new FileWriter(targetFile);
            myWriter.write("Hello class, this is an example of writing to a file from a Java program");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
