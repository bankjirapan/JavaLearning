
package abstractlearning.model;


//เรียกใช้ Class interface จะผ่าน implements
public abstract class Square implements ShapeInterface{

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
     public  double findArea(){
         return side*side;
     }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
    
}
