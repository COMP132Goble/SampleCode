package IOExamples;

public class Cat {
    public static void main(String[] args) {
        // concatenation of two strings
        System.out.println("\nHere are some facts for your " +
                            "edification, education, and enjoyment.");
        // prints a new line
        System.out.println();
        // Numeric values can be printed separately in print calls
        System.out.print("Number of eyes on a cyclops: ");
        System.out.println(1);

        // Numeric values can be concatenated with strings
        System.out.println("Number of days in February: " + 28);

        System.out.println("Columbus sailed in " + 1492 + " to America");

        int sides = 7;
        System.out.println("A septagon has " + sides + " sides");

        System.out.println();
    }
}
