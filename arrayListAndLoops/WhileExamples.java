package arrayListAndLoops;

import java.util.Scanner;

public class WhileExamples {

    public WhileExamples() {

    }

    public static void main(String[] args) {
        WhileExamples example = new WhileExamples();

        // example.whileLoop();
        // example.doWhileLoop();
        // example.motivation();
        // example.breakExample();
        example.continueExample();
    }

    public void whileLoop() {
        int i = 1, sum = 0;
        while (i <= 50) {
            sum += i;
            i++;
        }
        System.out.println("The sum of numbers from 1 through 50 is " + sum);
    }

    public void doWhileLoop() {
        int i = 1, sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 50);
        System.out.println("The sum of numbers from 1 through 50 is " + sum);
    }

    public void motivation() {
        Scanner s = new Scanner(System.in);
        int level;
        System.out.print("How insecure are you, on a scale of 1-10? " 
                  + "   (where 1 is least insecure, 10 is most)\n> ");
        level = s.nextInt();
        s.close();

        int i = 0;
        while (i < level) {
            System.out.println("i = " + i);
            System.out.println("You are a good person!");
            i++;
        }
        System.out.println("Final value of i = " + i);
    }

    public void breakExample() {
        int sum = 0;
        int item = 0;

        while (item < 5) {
            System.out.println("Running loop. Item = " + item);
            item++;
            sum += item;
            if (sum >= 6) {
                break;
            }
        }

        System.out.println("The sum is " + sum);
    }

    public void continueExample() {
        int sum = 0;
        int item = 0;

        while (item < 5) {
            item++;
            if (item == 2)
                continue;
            sum += item;
        }
        System.out.println("The sum is " + sum);
    }
}
