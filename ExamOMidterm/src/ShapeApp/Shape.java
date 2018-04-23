
package ShapeApp;

/**
 *
 * @author bankcom
 */
public abstract class Shape {
    
    
    private double area;
    private double peremeter;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPeremeter() {
        return peremeter;
    }

    public void setPeremeter(double peremeter) {
        this.peremeter = peremeter;
    }

    
    
    @Override
    public String toString() {
        return "Shape{" + "area=" + area + ", peremeter=" + peremeter + '}';
    }
    
    
    

    

    
    
    
}
