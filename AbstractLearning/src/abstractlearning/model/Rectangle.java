package abstractlearning.model;


//กรณีถ้าไม่ใส่ implement ----------------------
// Class โดดเดี่ยวไม่ผูกกับใคร
//สร้างได้อิสระ ไม่ผูกกับโครงสร้างใดเลย จะสร้างอะไรก็ได้

//-------------------------------------------



//ถ้าโยงไป implements จะต้องมี method ของ implement ใช้งานด้วย
public class Rectangle implements ShapeInterface {

    private double weight;
    private double lenght;

    public Rectangle(double weight, double lenght) {
        this.weight = weight;
        this.lenght = lenght;
    }

    // Class นี้มาจาก Implement ที่ต้องมี
    public double findArea() {
        return weight * lenght;
    }
    // Class นี้มาจาก Implement ที่ต้องมี

    public double findCircumference() {
        return 2 * (weight + lenght);
    }

    public double computeArea() {
        return weight * lenght;
    }

}
