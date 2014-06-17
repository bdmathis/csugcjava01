package program6;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class NumberLowException extends Exception {
    public NumberLowException() {
        super();
    }
    public NumberLowException(String str) {
        super(str);
    }
    public String toString() {
        return "NumberLowException";
    }
}
