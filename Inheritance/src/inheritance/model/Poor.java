package inheritance.model;

/**
 *
 * @author bankcom
 */
public class Poor {

    private String name;
    private String location;
    protected String Category;
    private String Descrption;
    private String DateSee;

    public Poor() {
    }

    public Poor(
            String name,
            String location,
            String Category, 
            String Descrption,
            String DateSee
    ) {
        
        this.name = name;
        this.location = location;
        this.Category = Category;
        this.Descrption = Descrption;
        this.DateSee = DateSee;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public String getDescrption() {
        return Descrption;
    }

    public void setDescrption(String Descrption) {
        this.Descrption = Descrption;
    }

    public String getDateSee() {
        return DateSee;
    }

    public void setDateSee(String DateSee) {
        this.DateSee = DateSee;
    }

    @Override
    public String toString() {
        return "Poor{" + "name=" + name + ", location=" + location + ", Category=" + Category + ", Descrption=" + Descrption + ", DateSee=" + DateSee + '}';
    }

}
