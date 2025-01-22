package ObjectsAndClasses;

public class Driver {
    public static void main(String[] args) {
        BankAccount person1 = new BankAccount();
        BankAccount person2 = new BankAccount(1234);

        person1.print();
        person2.print();

        System.out.println("Person1 has " + person1.getBalance() + " cents");
        System.out.println("Person2 has " + person2.getBalance() + " cents");
    }
}
