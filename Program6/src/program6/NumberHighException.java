package program6;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class NumberHighException extends Exception {
    public NumberHighException() {
        super();
    }
    public NumberHighException(String str) {
        super(str);
    }
    public String toString() {
        return "NumberHighException";
    }
}
