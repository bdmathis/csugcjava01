package program6;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class NumberNegativeException extends NumberLowException {
    public NumberNegativeException() {
        super();
    }
    public NumberNegativeException(String str) {
        super(str);
    }
    public String toString() {
        return "NumberNegativeException";
    }
}
