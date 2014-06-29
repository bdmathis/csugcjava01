package finalexam;

/**
 * Module8:FinalExam
 * 
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 *
 * Course:  ITS320
 * Date:  2014-06-29
 * Instructor:  Nathan Braun
 * 
 */

import java.io.*;
import java.util.Scanner;

public class FinalExam {

    public static void main(String[] args) throws IOException {
        
        // Declare variable for the account, scanner, and userInput
        SavingsAccount mySavings = null;
        Scanner console = null;
        double userInput = 0.00;
        
        try {
            // Create my savings account
            mySavings = new SavingsAccount("Brady's School Fund", 15.00, .012);
            mySavings.printStatement();
            
            // Create a scanner to read the console
            console = new Scanner(System.in);

            // Prompt for a deposit amount
            System.out.print("\nPlease enter a deposit amount:  ");
            userInput = console.nextDouble();
            
            // Make a deposit
            mySavings.depositMoney(userInput);
            
            // Prompt for a withdrawal amount
            System.out.print("\nPlease enter a withdrawal amount:  ");
            userInput = console.nextDouble();
            
            // Make a withdrawal
            mySavings.withdrawMoney(userInput);
            
            // Post some interest for a month
            System.out.println("\nWow, a whole month has passed, you earned interest!\n");
            mySavings.postMonthlyInterest();
            
        }
        catch (NegativeAmountException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
       }
    }   
}
