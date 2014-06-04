package program5;

/**
 * Module6:PolyMain_MathisB
 * 
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 *
 * Course:  ITS320
 * Date:  2014-06-15
 * Instructor:  Nathan Braun
 * 
 */
public class PolyMain_MathisB {
    public static void main(String [] args)    
    {     
        Book [] library = new Book [5];      
        library[0] = new Novel("Jaws", 300, 15);     
        library[1] = new Almanac("New World ", 100, 50);     
        library[2] = new Novel("Animal Farm", 250, 9);
        library[3] = new Phone("Grand County Phone Book", 15, 50);
        library[4] = new Phone("Los Angeles Phone Book", 40000, 120000);
        listBooks(library);    
    }     
    static void listBooks(Book [] library)    
    {     
        for (int i = 0; i < library.length && library[i] != null; i++)       
        library[i].print();    
    }     
}
