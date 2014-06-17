package program6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Module7:Program6_MathisB
 * 
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 *
 * Course:  ITS320
 * Date:  2014-06-22
 * Instructor:  Nathan Braun
 * 
 */
public class Program6_MathisB {
    public static void main(String[] args){
        
        final int RANGE_MIN = 10;
        final int RANGE_MAX = 100;
        
        // Declare a variable to hold user input
        int userInput = 0;
        Boolean isValid = false;
        
        // Create a scanner to read the console
        Scanner console = new Scanner(System.in);
        
        // Create a number verification class instance with a valid range of 10 to 100
        Verify range = new Verify(RANGE_MIN, RANGE_MAX);
        
        // Prompt the use for input
        System.out.print("Please enter a number between " + RANGE_MIN + " and " + RANGE_MAX + " --> ");
                
        try {
            userInput = console.nextInt();
            isValid = range.validate(userInput);
        }
        catch (InputMismatchException e) {
            System.out.println("Your entry is not valid.");
        }
        catch (NumberLowException | NumberHighException e) {
            System.out.println("The following exception occurred:  " + e.toString() + " " + e.getMessage());
        }
        
        // If no exceptions occur, the value is valid
        if (isValid) {
            System.out.println("The value you entered [" + userInput + "] is within the specified range.");
        }
        
    }
}
