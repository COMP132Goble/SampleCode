package FileWork;

import java.io.File;

public class FileObject {
    public static void main(String[] args) {
        File myOjbect = new File("./FileWork/testFile.txt");

        if (myOjbect.exists()) {
            System.out.println("File name: " + myOjbect.getName());
            System.out.println("Absolute path: " + myOjbect.getAbsolutePath());
            System.out.println("Writeable: " + myOjbect.canWrite());
            System.out.println("Readable " + myOjbect.canRead());
            System.out.println("File size in bytes " + myOjbect.length());
        } else {
            System.out.println("This file does not exist");
        }
    }
}
