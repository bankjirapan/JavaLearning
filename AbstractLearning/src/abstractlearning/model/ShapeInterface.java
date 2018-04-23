
package abstractlearning.model;


//ประกาศว่าเป็น interface มีหน้าที่ ล๊อคโครงสร้าง

//สร้าง object ไม่ได้
public interface ShapeInterface {
    
    int color = 256;
    
    
    //เป็น Method 
    public abstract double findArea();
    public abstract double findCircumference();
    
    
    //ถ้าสมมุติอยากได้ค่าแสดงค่าออกมา
    
}
