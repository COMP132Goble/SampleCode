package IOExamples;

import java.util.Scanner;

class Functions1 {
    public static int sum(int x, int y, int z) {
        int answer;
        answer = x + y + z;
        return answer;
    }    

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }
    
    public static boolean inOrder(int x, int y, int z) {
        if (x <= y && y <= z) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int i1, i2, i3;
        double d1, d2, d3;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input three integers: ");
        i1 = input.nextInt();
        i2 = input.nextInt();
        i3 = input.nextInt();

        System.out.print("Input three doubles: ");
        d1 = input.nextDouble();
        d2 = input.nextDouble();
        d3 = input.nextDouble();

        double avg;
        int total;
        total = sum(i1, i2, i3);
        avg = average(d1, d2, d3);
        
        System.out.println("The sum of the three integers: " + total);
        System.out.println("The average of the three doubles: " + avg);
        
        System.out.println("The sum of 10, 14, and 18 = " + sum(10, 14, 18));

        System.out.println("The average of 1.3, 2.7, and 6.9 = " +
				average(1.3, 2.7, 6.9) );


        // Notice that we can pass in integers where doubles are expected
        //   legal via automatic-type-conversion rules
        System.out.println("The average of the three integers = " +
                    average(i1, i2, i3) );


        // Testing out the boolean function (InOrder)
        if (inOrder(i1, i2, i3))
            System.out.println("The three integers were in ascending order");
        else
            System.out.println("The three integers were NOT in ascending order");

        input.close();
    }
}
