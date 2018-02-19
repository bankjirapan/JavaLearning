
package abstractlearning.model;


// Class โดดเดี่ยวไม่ผูกกับใคร

//สร้างได้อิสระ ไม่ผูกกับโครงสร้างใดเลย จะสร้างอะไรก็ได้


//ถ้าโยงไป implements จะต้องมี method ของ implement ใช้งานด้วย
public class Rectangle {
    
    private double weight;
    private double lenght;

   
    public Rectangle(double weight, double lenght) {
        this.weight = weight;
        this.lenght = lenght;
    }
    
    public double computeArea(){
        return weight*lenght;
    }
    
    
    
}
