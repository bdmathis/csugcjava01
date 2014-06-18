package finalexam;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class NegativeAmountException extends Exception {
    public NegativeAmountException() {
        super();
    }
    public NegativeAmountException(String str) {
        super(str);
    }
    public String toString() {
        return "NegativeAmountException";
    }
}
