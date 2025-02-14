package staticFieldsAndMethods;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private static int nextID = 1;
    private int studentID;
    private String name;

    public Student(String name) {
        this.name = name;
        studentID = nextID;
        nextID++;
    }

    public String toString() {
        return name + "\t(" + studentID + ")";
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide me three names: ");
        for (int i = 0; i < 3; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            String name = input.nextLine();
            Student temp = new Student(name);
            students.add(temp);
        }
        input.close();

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}