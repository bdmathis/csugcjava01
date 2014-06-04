package program5;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class Phone extends Book {
    private int whitePages, yellowPages;
    public Phone(String title, int whitePages, int yellowPages) {
        super(title, whitePages + yellowPages);
        this.whitePages = whitePages;
        this.yellowPages = yellowPages;
    }
    public void print()
    {
        super.print();
        System.out.println( ", " + yellowPages + " yellow pages and " + whitePages + " white pages");
    }
}
