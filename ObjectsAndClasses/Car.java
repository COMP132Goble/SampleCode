package ObjectsAndClasses;
/**
 * A simple class to demonstrate how we can create packages in Java. 
 * Here we will create a Car object that we can use in various other 
 * projects.
 * 
 * @author William Goble
 */
public class Car {
    private String make;
    private String modle;
    private int year;
    private String color;

    public Car() { 
        this("Ford", "F150", 2019, "blue");
    }

    public Car(String mk, String mod, int yr, String clr) {
        make = mk;
        modle = mod;
        year = yr;
        color = clr;
    }

    public String toString() {
        return color + " " + year + " " + make + " " + modle;
    }

    public void show() {
        System.out.print(color + " " + year + " " + make + " " + modle);
    }

    // Accessor methods; also called "getters"
    public String getMake() {
        return make;
    }

    public String getModel() {
        return modle;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Mutator methods; also called "setters"
    public void setMake(String newMake) {
        make = newMake;
    }

    public void setModel(String newModel) {
        modle = newModel;
    }

    public void setYear(int newYear) {
        year = newYear;
    }

    public void setColor(String newColor) {
        color = newColor;
    }
}
