package Inheritance.abstractClass;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employList;

    public EmployeeList() {
        employList = new ArrayList<Employee>();
    }

    public void addEmployee(Employee person) {
        employList.add(person);
    }

    public void displayBasePays() {
        for(Employee e : employList) {
            String amount = String.format("%.2f", e.getBasePay());
            System.out.println(e.getName() + "\t$" + amount);
        }
    }

    public static void main(String[] args) {
        EmployeeList workers = new EmployeeList();
        workers.addEmployee(new SalariedEmployee("Joe", 57000.00));
        workers.addEmployee(new HourlyEmployee("Sam", 12.53));
        workers.addEmployee(new SalariedEmployee("Jane", 104376.00));
        workers.addEmployee(new HourlyEmployee("Kim", 10.98));
        
        workers.displayBasePays();
    }
}
