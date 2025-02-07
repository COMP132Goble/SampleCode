package IOExamples;

import java.util.Scanner;

public class InputBasics {
    public static void main(String[] args) {
        System.out.println("Please type an int, then a double, and then a string");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        double y = input.nextDouble();
        String z = input.next();

        input.close();
        System.out.println("You stated: ");
        System.out.printf("%d\t%f\t%s\n", x, y, z);
    }
}
