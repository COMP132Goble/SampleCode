package Inheritance.abstractClass;

public class SalariedEmployee extends Employee {
    public SalariedEmployee(String name, double payRate) {
        super(name, payRate);
    }

    public double getBasePay() {
        return payRate / 52.0;
    }

    public void addBonus(double bouns) {
        // Can have other salaried employee Specific methods here too
    }
}
