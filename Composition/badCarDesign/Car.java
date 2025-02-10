package Composition.badCarDesign;

/**
 * A bad design for a Car class. This class would be better implemened using 
 * composition
 * 
 * @author Grant Braught, revised by William Goble
 */
public class Car {
    private String make;
    private String model;
    private String color;
    private int year;

    private String frontWheelManufacturer;
    private int frontWheelSize;
    private float frontWheelPressure;

    private String rearWheelManufacturer;
    private int rearWheelSize;
    private float rearWheelPressure;

    private String radioManufacturer;
    private int radioPower;
    private boolean radioHasCDChanger;
    private boolean radioPlaysMP3s;

    private int engineSize;
    private int enginePower;
    private int engineCylinders;

    /**
     * Constructors, accessors, and mutators intentionally omitted for this 
     * example.
     */
}
