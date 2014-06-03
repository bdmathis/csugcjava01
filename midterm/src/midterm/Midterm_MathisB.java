package midterm;

/**
 * midterm
 * 
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 *
 * Course:  ITS320
 * Date:  2014-06-08
 * Instructor:  Nathan Braun
 * 
 */

public class Midterm_MathisB {

    public static void main(String[] args) {
        
        // Declare and initialize array
        final int LINE_LENGTH = 5;
        int[] numbers = new int[25];
        
        // Iterate through the elements, populate and print
        for(int i=0; i<numbers.length; ++i )
        {
            // Values in each array element should be 1 more than the index
            numbers[i] = i+1;
            
            // Assemble and print values,
            // Insert a newline after each 5 values, otherwise insert a comma
            System.out.print(numbers[i] + (((i+1) % LINE_LENGTH == 0)?"\n":", "));
        }
        
    }
    
}
