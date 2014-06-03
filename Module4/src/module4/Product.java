package module4;

/**
 * Module4 - Product Class
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

public class Product {
    
    // Intialize instance variables
    private double unitPrice;
    private int unitsPurchased = 0;
    private double totalPrice = 0.00;
    String productName;

    // constructors support passing a price argument, or sets the price to 0.00
    public Product()
    {
        setUnitPrice(0.00);
        productName = "My Product";
    }
    public Product(double price)
    {
        setUnitPrice(price);
        setProductName("My Product");
    }
    public Product(double price, String name)
    {
        setUnitPrice(price);
        setProductName(name);
    }
    
    // Mutator methods
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        calculateTotal();
    }

    public int getUnitsPurchased() {
        return unitsPurchased;
    }

    public void setUnitsPurchased(int unitsPurchased) {
        this.unitsPurchased = unitsPurchased;
        calculateTotal();
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    
    // Behavior methods
    private void calculateTotal()
    {
        totalPrice = unitPrice * unitsPurchased;
    }
    public String getPurchaseInformation()
    {
        return
                NumberFormat.getInstance().format(unitsPurchased) +
                ((abs(unitsPurchased) == 1)?" unit of ":" units of ") + productName +
                " at " + NumberFormat.getCurrencyInstance().format(unitPrice) + 
                " --> " + NumberFormat.getCurrencyInstance().format(totalPrice);
    }
}
