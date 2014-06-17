package program6;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class Verify {
    
    // Instance variables for the end-points of the range
    private int minValue, maxValue;
    
    // Constructor accepting arguments for the range
    public Verify( int minValue, int maxValue) {
        setMinValue(minValue);
        setMaxValue(maxValue);
    }
 
    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
    
    public Boolean validate(int numToCheck) throws NumberHighException, NumberLowException {
        Boolean isValid = true;
        if (numToCheck < 0) {
            throw new NumberNegativeException("The number provided was less than zero: " + numToCheck);
        }
        if (numToCheck < minValue) {
            throw new NumberLowException("The number provided was lower than the minimum value: " + numToCheck + " < " + minValue);
        }
        if (numToCheck > maxValue) {
            throw new NumberHighException("The number provided was higher than the maximum value: " + numToCheck + " > " + maxValue);
        }
        return isValid;
    }  
}
