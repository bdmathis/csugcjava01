package finalexam;

import java.text.NumberFormat;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class BankAccount {
    
    // Declare instance variable for BankAccount
    private double accountBalance = 0.00;
    private String accountName;
    private Boolean printStatementAfterTransaction = true;
    
    // Constructor that accepts the name and balance
    public BankAccount(String name, double balance) throws NegativeAmountException {
        setAccountName(name);
        setAccountBalance(balance);
    }
    
    // Constructor that accepts only the account name
    public BankAccount(String name) throws NegativeAmountException {
        setAccountName(name);
        setAccountBalance(0.00);
    }
    
    // Method to make a deposit
    public void depositMoney(double depositAmount) throws NegativeAmountException {
        if (depositAmount <= 0.0) {
            throw new NegativeAmountException("The deposit amount must be greater than $0.00");
        }
        setAccountBalance(getAccountBalance() + depositAmount);
        if (printStatementAfterTransaction) printStatement();
    }
    
    // Method to make a withdrawal
    public void withdrawMoney(double withdrawalAmount) throws NegativeAmountException, InsufficientFundsException {
        if (withdrawalAmount <= 0.0) {
            throw new NegativeAmountException("The withdrawal amount must be greater than $0.00");
        }
        double balance = getAccountBalance();
        if (withdrawalAmount > balance) {
            throw new InsufficientFundsException("The withdrawal cannot be commpleted, funds are insufficient");
        }
        setAccountBalance(balance - withdrawalAmount);
        if (printStatementAfterTransaction) printStatement();
    }
    
    // Method to print a statment of the account
    public void printStatement() {
        System.out.println("Account name:  " + getAccountName());
        System.out.println("Account balance:  " + NumberFormat.getCurrencyInstance().format(getAccountBalance()));
    }
    
    // Method to set the account balance, ensuring the amount is valid
    private void setAccountBalance(double accountBalance) throws NegativeAmountException {
        if (accountBalance < 0.0) {
            throw new NegativeAmountException("The account balance cannot be less than $0.00");
        }
        this.accountBalance = accountBalance;
    }

    
    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    private void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    
}
