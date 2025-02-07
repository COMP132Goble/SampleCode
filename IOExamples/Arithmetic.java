package IOExamples;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integet for x: ");
        int x = input.nextInt();
        System.out.print("Enter integer value for y: ");
        int y = input.nextInt();

        // display arithmetic results
        System.out.println();
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));
        System.out.println();

        double a, b;
        System.out.print("Enter double (float) value for a: ");
        a = input.nextDouble();
        System.out.print("Enter double (float) value for b: ");
        b = input.nextDouble();

        // display arithmetic results
        System.out.println();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        System.out.println();

        input.close();
    }
}
