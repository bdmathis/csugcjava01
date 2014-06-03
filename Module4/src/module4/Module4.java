package module4;

/**
 * Module4
 * 
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 *
 * Course:  ITS320
 * Date:  2014-06-01
 * Instructor:  Nathan Braun
 * 
 */

import static java.lang.Math.abs;
import java.text.NumberFormat;
import javax.swing.*;

public class Module4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Initialize variables
        String userInput, purchaseInfo = "";
        Double purchaseTotal = 0.00;
        Boolean askForInput = true;
        Integer productID, units, unitsTotal = 0;
        
        // Initialize all products passing the unit price to the constructor
        Product product1 = new Product(2.98, "Product 1");
        Product product2 = new Product(4.50, "Product 2");
        Product product3 = new Product(9.98, "Product 3");
        Product product4 = new Product(4.49, "Product 4");
        Product product5 = new Product(6.87, "Product 5");
        
        while(askForInput)
        {
            
            // Prompt the user to enter the product id (1-5)
            userInput = JOptionPane.showInputDialog(
                    null, 
                    "Please enter a product number (valid entries are 1-5).", 
                    "Product number entry", 
                    JOptionPane.PLAIN_MESSAGE);
            
            // Ensure user input is valid
            if (userInput != null && !userInput.isEmpty())
            {
                // Convert the user input to an int and validate it
                productID = Integer.parseInt(userInput);
                if (productID > 0 && productID < 6)
                {
                    // The user has entered a valid product ID
                    // now prompt for a number of units
                    userInput = JOptionPane.showInputDialog(
                            null, 
                            "Please enter the number of [Product "+ productID + "] you would like.", 
                            "How many items?", 
                            JOptionPane.PLAIN_MESSAGE);
                    
                    // Validate the number of units
                    if (userInput != null && !userInput.isEmpty())
                    {
                        // Set the purchased units for the appropriate product
                        units = Integer.parseInt(userInput);
                        unitsTotal += units;
                        switch(productID)
                        {
                            case 1:
                                product1.setUnitsPurchased(units);
                                purchaseTotal += product1.getTotalPrice();
                                purchaseInfo += product1.getPurchaseInformation() + "\n";
                                break;
                            case 2:
                                product2.setUnitsPurchased(units);
                                purchaseTotal += product2.getTotalPrice();
                                purchaseInfo += product2.getPurchaseInformation() + "\n";
                                break;
                            case 3:
                                product3.setUnitsPurchased(units);
                                purchaseTotal += product3.getTotalPrice();
                                purchaseInfo += product3.getPurchaseInformation() + "\n";
                                break;
                            case 4:
                                product4.setUnitsPurchased(units);
                                purchaseTotal += product4.getTotalPrice();
                                purchaseInfo += product4.getPurchaseInformation() + "\n";
                                break;
                            case 5:
                                product5.setUnitsPurchased(units);
                                purchaseTotal += product5.getTotalPrice();
                                purchaseInfo += product5.getPurchaseInformation() + "\n";
                                break;
                            default:
                                JOptionPane.showMessageDialog(
                                    null,
                                    "The product ID is not valid, even though it was a second ago.  You have confused the programmer.");
                        }
                    }
                }
                else
                {
                    // The user has entered an invalid product ID
                    // tell them about the problem and loop.
                    JOptionPane.showMessageDialog(
                        null,
                        "You entered an invalid product number.\nValid numbers are 1 through 5.");
                    
                }
            }
            
            // Ask the user if they want to continue
            if (JOptionPane.showConfirmDialog(
                    null, 
                    "So far, you have bought:\n\n" + ((purchaseInfo.isEmpty())?"Nothing":purchaseInfo) + 
                            "\nThe total purchase is " + unitsTotal + ((abs(unitsTotal) == 1)?" unit ":" units ") +
                            "for " + NumberFormat.getCurrencyInstance().format(purchaseTotal) +
                            "\n\nDo you want to purchase another product?", 
                    "Continue purchasing?", 
                    JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION)
                {
                    // User answered NO, set variable to terminate the loop
                    askForInput = false;
                }
        }
        
        // The loop has terminated, display the total purchase
        JOptionPane.showMessageDialog(
            null,
            "Thanks for buying my stuff!" +
                    "\nThe total purchase is " + unitsTotal + ((abs(unitsTotal) == 1)?" unit ":" units ") +
                            "for " + NumberFormat.getCurrencyInstance().format(purchaseTotal));
                
    }
    
}
