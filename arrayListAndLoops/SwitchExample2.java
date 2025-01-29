package arrayListAndLoops;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        char grade;
        System.out.print("\nPlease enter test grade: ");
        score = input.nextInt();
        input.close();

        switch (score / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';    // anything below 60 flunks
        }

        System.out.println("\nStudent grade = " + grade);
    }
}
