package ObjectsAndClasses;
/**
 * Sample program that creates a fraction data type
 * 
 * @author Bob Myers, revised by William Goble
 */
class Fraction {
    private int numerator = 0;      // top part of fraction, keeps sign
    private int denominator = 1;    // bottom part of fraction, always positive

    /**
     * Default constructor, just uses the base values for numerator and denominator
     */
    public Fraction() { }

    /**
     * Constructor with one parameter, converts whole number into a fraction
     * @param num
     */
    public Fraction(int num) {
        this(num, 1);
    }

    /**
     * Constructor with two parameters, will use the set function to see if 
     * we have a valid fraction first.
     * 
     * @param num
     * @param denom
     */
    public Fraction(int num, int denom) {
        if (set(num, denom) == false ) {
            set(0, 1);
        }
    }

    /**
     * Checks to see if we are dealing with a valid fraction, remember we only 
     * want the denominator to be positive
     * @param num
     * @param denom
     * @return
     */
    public boolean set(int num, int denom) {
        if (denom > 0) {
            numerator = num;
            denominator = denom;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Used to print out the fraction in a format we are use to
     */
    public void show() {
        System.out.print(numerator + "/" + denominator);
    }

    /** 
     * Useful if we want to use our fraction within a string 
     * i.e. string concatenation
     */
    public String toString() {
        return (numerator + "/" + denominator);
    }

    /***** Accessor methods *****/

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        Fraction f1, f2;
        f1 = new Fraction();
        f2 = new Fraction(3, 5);

        System.out.print("\nFraction f1 = ");
        f1.show();
        System.out.print("\nFraction f2 = " + f2);      // This uses the toString method

        System.out.println("\nCalling f1.set(11,14)");
        if (f1.set(11,14) == false)
	        System.out.println("** set attempt failed");
        System.out.println("\nCalling f2.set(4,0)");
        if (!f2.set(4,0))
	        System.out.println("** set attempt failed");
        
        System.out.print("\nFraction f1 = ");
        f1.show();
        System.out.print("\nFraction f2 = ");
        f2.show();

        System.out.println("\nDecimal value of f1 = " + f1.decimal());
        System.out.println("Decimal value of f2 = " + f2.decimal());
    }
}