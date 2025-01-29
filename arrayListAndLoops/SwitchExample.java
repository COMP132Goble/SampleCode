package arrayListAndLoops;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score;
        char grade;
        System.out.print("\nPlease enter a test grade: ");
        score = input.nextInt();
        input.close();

        if (score >= 90)
            grade = 'A';
        else if (score >= 80)
            grade = 'B';
        else if (score >= 70)
            grade = 'C';
        else if (score >= 60)
            grade = 'D';
        else 
            grade = 'F';
        
        System.out.println("\nStudent grade = " + grade);
    }
    
}
