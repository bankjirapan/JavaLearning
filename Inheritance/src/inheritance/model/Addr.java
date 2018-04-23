
package inheritance.model;

/**
 *
 * @author bankcom
 */
public class Addr extends Poor{
    
    private String Address;

    public Addr(String Address) {
        this.Address = Address;
    }

    public Addr(String Address, String name, String location, String Category, String Descrption, String DateSee) {
        super(name, location, Category, Descrption, DateSee);
        this.Address = Address;
    }
    

   

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    

    

    @Override
    public String toString() {
        return "Name of poor = "+ getName() +" Address of poor : "+this.Address;
    }
    
    
    

    
    
    
    
    
    


    
    
    
}
