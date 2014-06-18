package finalexam;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        super();
    }
    public InsufficientFundsException(String str) {
        super(str);
    }
    public String toString() {
        return "InsufficientFundsException";
    }
}
