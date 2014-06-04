package program5;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class Almanac extends Book {
    private int charts;      
    public Almanac(String title, int pages, int charts)    
    {     
        super(title, pages);     
        setCharts(charts);   
    }    
    public boolean setCharts(int charts)
    {    
        if(charts > getPages())      
        {       
            System.err.println("Too many charts");       
            return false;     
        } 
        else 
        {       
            this.charts = charts;       
            return true;     
        }       
    }     
    public int getCharts()    
    {      
        return charts; 
    }    
    public void print()    
    {     
        super.print();     
        System.out.println(" and " + charts + " charts");   
    }     
}
