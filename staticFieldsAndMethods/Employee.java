package staticFieldsAndMethods;

public class Employee {
    private static int numEmployees = 0;
    private String firstName;
    private String lastName;

    public Employee(String first, String last) {
        this.firstName = first;
        this.lastName = last;
        ++numEmployees;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String toString() {
        return getName();
    }

    public static int numberEmployed() {
        return numEmployees;
    }

    public static void main(String[] args) {
        Employee person1 = new Employee("John", "Deere");
        Employee person2 = new Employee("Jane", "Doe");
        Employee person3 = new Employee("Other", "Person");

        System.out.println("There are " + Employee.numberEmployed() + " people working here");
    }
}
