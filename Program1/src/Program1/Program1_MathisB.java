package Program1;


/**
 * Program #1
 * 
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 *
 * Course:  ITS320
 * Date:  2014-05-18
 * Instructor:  Nathan Braun
 * 
 */
public class Program1_MathisB {

    public static void main(String[] args) {
        
        //Initialize the variables used in this exercise
        int xxInt = 315, value1 = 43, value2 = 10, sum, difference, product, quotient, modulus;
        short xxShort = 23;
        long xxLong = 1234567876543L;
        boolean isProgrammingFun = true;
        double doubNum1 = 2.3, doubNum2 = 14.8, doubResult;
        char myGrade = 'A', myFriendsGrade = 'C';
        
        //Generate the console output
        System.out.println("Our grades are " + myGrade + " and " + myFriendsGrade);
        doubResult = doubNum1 + doubNum2;
        System.out.println("The sum of the doubles is " + doubResult);
        doubResult = doubNum1 * doubNum2;
        System.out.println("The product of the doubles is " + doubResult);
        System.out.println("The value of isProgrammingFun is " + isProgrammingFun);
        System.out.println("The value of isProgrammingHard is " + isProgrammingFun);
        System.out.println("The int is " + xxInt);
        System.out.println("The short is " + xxShort);
        System.out.println("The long is " + xxLong);
        
        // Perform some computations with the values
        sum = value1 + value2;
        difference = value1 - value2;
        product = value1 * value2;
        quotient = value1 / value2;
        modulus = value1 % value2;
        
        // Generate some more console output
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
        System.out.println("Product is " + product);
        System.out.println("Quotient is " + quotient);
        System.out.println("Modulus is " + modulus);
        System.out.println("\nThis is on one line\nThis on another");
        System.out.println("This shows\thow\ttabs\twork");
        
    } // end method main
} // end class Program1_MathisB

