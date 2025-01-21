package ObjectsAndClasses;

public class BankAccount {
    private int acctNumber;
    private int balance;

    /**
     * Constructor for creating an Account object with
     * default values for the fields.
     */
    public BankAccount() {
        balance = 0;
        acctNumber = 0;
    }

    public BankAccount(int initAcctNumber) {
        acctNumber = initAcctNumber;
        balance = 0;
    }

    /**
     * set the account number
     * @param acct the new account number
     */
    public void setAccountNumber(int acct) {
        acctNumber = acct;
    }
    
    /**
     * get the account number
     * @return the account number
     */
    public int getAccountNumber() {
        return acctNumber;
    }
    
    /**
     *  deposit money into the account
     *  @param depAmount the amount to deposit
     */
    public void deposit(int depAmount) {
        balance = balance + depAmount;
    }
    
    /** 
     * withdraw money from the account
     * @param withAmount the amount to withdraw
     */
    public void withdraw(int withAmount) {
         balance = balance - withAmount;
    } 
  
    /** 
     * check the account balance (an accessor method)
     * @return the account balance
     */
    public int getBalance() {
        return balance;
    }
    
    /**
     * display the account number and balance on the screen
     */
    public void print() {
        System.out.println("Account number: " + acctNumber);
        System.out.println("Balance is: " + balance + " cents.");
    }

}
