package program5;


/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class Book {
   
    private String title;     
    private int pages;    
    public Book(String title, int pages)    
    {
         this.title = new String(title);
         setPages(pages);   
    }    
    public void setPages(int pages)    
    {
         this.pages = pages;   
    }    
    public int getPages()    
    {  
        return pages;    
    }    
    public void print()    
    {     
        System.out.print(title + " has " + pages + " pages");   
    }
}
