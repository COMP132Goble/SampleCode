package Recursion;

public class RecursiveMath {
    // factorial(n) = n * factorial(n-1)
    // factorial(0) = 1
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    // mystery(n) = 2 + mystery(n-2)
    // mystery(2) = 4
    public static int mystery(int n) {
        if (n == 2) {
            return 4;
        } else if (n == 1) {
            return 7;
        } else {
            return 2 + mystery(n-2);
        }
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;   // base case
        } else {
            return n + sum(n-1);    // recursive case
        }
    }

    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
    }
} 
