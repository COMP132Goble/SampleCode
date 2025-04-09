package FileWork;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadingFiles {
    public static void main(String[] args) throws IOException {
        try {
            File targetFile = new File("./FileWork/testFile.txt");
            if (targetFile.exists()) {
                Scanner myReader = new Scanner(targetFile);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data.toUpperCase());
                }
                myReader.close();
            }   
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
