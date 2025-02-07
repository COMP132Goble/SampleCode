package IOExamples;

import java.util.Scanner;

public class ConsoleInput1 {
    public static void main(String[] args) {
        int x = 5, y = 8;
        Scanner s = new Scanner(System.in);

        System.out.println("Hello, World!\n");

        System.out.println("Initial values of variables:");
        System.out.println("\tx = " + x + " \ty = " + y);
        
        System.out.print("Enter a value for x: ");
        x = s.nextInt();
        System.out.print("Enter a value for y: ");
        y = s.nextInt();

        System.out.println("New values of x and y are:");
        System.out.println("\tx = " + x + " \ty = " + y);
        s.close();
    }
}
