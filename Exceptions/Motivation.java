package Exceptions;

import java.util.Scanner;

public class Motivation {
    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        System.out.print("Type numerator: ");
        x = input.nextInt();
        System.out.print("Type denominator: ");
        y = input.nextInt();

        System.out.println("x / y = " + (x/y));
        System.out.println("Now we are past the division!");
    }
}