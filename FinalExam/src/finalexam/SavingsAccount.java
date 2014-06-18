package finalexam;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class SavingsAccount extends BankAccount  {
    
    // Constructors as implemented in the superclass with additional argument for the interest
    public SavingsAccount(String name, double balance, double interest) throws NegativeAmountException {
        super(name, balance);
        setInterestRate(interest);
    }
    public SavingsAccount(String name, double interest) throws NegativeAmountException {
        super(name);
        setInterestRate(interest);
    }
    
    // Instance variables
    private double interestRate = 0.00;
    
    // Method to calculate and post monthly interest
    public void postMonthlyInterest() throws NegativeAmountException {
        
        // Calculate the interest for the month and add to the account balance
        double balance = getAccountBalance();
        depositMoney(balance * (interestRate / 12));
    }
    
    // Override superclass statement method to include interest with printed output
    public void printStatement() {
        super.printStatement();
        System.out.println("Annual interst rate:  " + getInterestRate());
    }
    
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
}
