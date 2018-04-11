package ShapeApp;

/**
 *
 * @author bankcom
 */
public class Circle extends Shape {

    private double Area;
    private double Peremeter;

    public Circle(double Area) {
        this.Area = Area;

        super.setArea(3.14 * (Area * Area));
        super.setPeremeter(2 * (3.14 * Area));
    }

    @Override
    public String toString() {
        return "Circle{" + "Area=" + super.getArea() + ", Peremeter=" + super.getPeremeter() + '}';
    }

}
