package Composition.bank;

public class Account {
    private int acctNumber;
    private int balance;
    private int interestRate;

    public Account(int acctNumber, int rate) {
        this.acctNumber = acctNumber;
        this.balance = 0;
        this.interestRate = rate;
    }

    public void setAccountNumber(int acct) {
        acctNumber = acct;
    }

    public int getAccountNumber() {
        return acctNumber;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (amt <= balance)
            balance -= amt;
        else 
            System.out.println("Withdrawl cancelled");
    }

    public int computeQuarterlyInterest() {
        int interestAmount = computeAnnualInterestAmount() / 4;
        return interestAmount;
    }

    public void addInterest() {
        int interestAmount = interestRate / 100 * balance;
        balance = balance + interestAmount;
    }

    public int computeAnnualInterestAmount() {
        int interestAmount = interestRate / 100 * balance;
        return interestAmount;
    }

    public int getBalance() {
        return balance;
    }

    public void printDollarBalance() {
        int dollars = balance / 100;
        System.out.println("Dollar balance is " + dollars);
    }

    public void print() {
        int dollars = balance / 100;
        int cents = balance % 100;

        if (cents < 10)
            System.out.println("Balance is: $" + dollars + ".0" + cents);
        else
            System.out.println("Balance is: $" + dollars + "." + cents);
    }
}
