package Inheritance.abstractClass;

public abstract class Employee {
    private String name;
    protected double payRate;

    public Employee(String name, double payRate) {
        this.name = name;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public double getPayRate() {
        return payRate;
    }

    /**
     * Compute one week's base pay for this Employee
     * @return
     */
    abstract public double getBasePay();
}
