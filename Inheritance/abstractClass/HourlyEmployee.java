package Inheritance.abstractClass;

public class HourlyEmployee extends Employee {
    public static final int BASE_HOURS_PER_WEEK = 40;

    public HourlyEmployee(String name, double payRate) {
        super(name, payRate);
    }

    public double getBasePay() {
        return payRate * BASE_HOURS_PER_WEEK;
    }

    public void addOvertime(double hours) {
        // Can have other hourly employee specific methods 
        // included here too
    }
    
}
