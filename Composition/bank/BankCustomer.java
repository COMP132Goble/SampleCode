package Composition.bank;

public class BankCustomer {
    private String name;
    private String address;
    private String phoneNumber;
    private Account checking;
    private Account savings;

    /**
     * Constructor for objects of class BankCustomer
     * 
     * @param name      the name of the customer
     * @param address   the address of the customer
     * @param phoneNumber   the telephone number of the customer
     * @param checking  the customer's checking account
     * @param savings   the customer's savings account
     */
    public BankCustomer(String name, String address, String phoneNumber, 
                        Account checking, Account savings) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.checking = checking;
        this.savings = savings;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void print() {
        System.out.println("Name: " + name + " || Address:  " + address  + " || Phone Number:  " + phoneNumber + " " + " || Checking account number : " + 
    			checking.getAccountNumber() + " || savings account number: " + savings.getAccountNumber());
    }

    public void depositChecking(int amt) {
        checking.deposit(amt);
    }

    public void depositSavings(int amt) {
        savings.deposit(amt);
    }

    public void withdrawChecking(int amt) {
        checking.withdraw(amt);
    }

    public void withdrawSavings(int amt) {
        savings.deposit(amt);
    }

    public int getTotalBalance() {
        return checking.getBalance() + savings.getBalance();
    }

    /**
     * Transfers money from savings to checking
     * @param amt
     */
    public void savingsToChecking(int amt) {
        this.withdrawSavings(amt);
        this.depositChecking(amt);
    }
}
