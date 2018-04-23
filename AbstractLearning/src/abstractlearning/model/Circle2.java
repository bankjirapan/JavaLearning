package abstractlearning.model;

public class Circle2 extends Circle {

    public Circle2(double radius) {
        super(radius);
    }

    public Circle2(double radius, int shapeId) {
        super(radius, shapeId);
    }

 
   
    public double findCircumference() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return super.toString();
    }



}
