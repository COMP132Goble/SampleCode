package FileWork;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {
    public static void main(String[] args) throws IOException {
        try {
            File myFile = new File("./FileWork/sample.txt");
            if(myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
