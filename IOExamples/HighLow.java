package IOExamples;

import java.util.Random;

public class HighLow {
    public static void main(String[] args) {
        Random generator = new Random();    // random number generator
        // generate a number between 1 and 100 inclusive
        int number = generator.nextInt(100) + 1;
    }
}
