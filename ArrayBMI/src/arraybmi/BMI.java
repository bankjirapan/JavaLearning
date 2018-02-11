
package arraybmi;

public class BMI {
    
    private String name;
    private double Weight;
    private double Height;
    private double CalBMI;
    
    
    public BMI(String name,double Weight,double Height){
        this.name = name;
        this.Height = Height;
        this.Weight = Weight;
        
        if(Height < 0 || Weight < 0){
            this.CalBMI = -1;
        } else if(Height == 0){
            this.CalBMI = -2;
        }
        
        this.CalBMI = Weight / (Height*Height);
    }

    public BMI() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getCalBMI() {
        return CalBMI;
    }

    public void setCalBMI(double CalBMI) {
        this.CalBMI = CalBMI;
    }

    @Override
    public String toString() {
        return "BMI{" + "name=" + name + ", Weight=" + Weight + ", Height=" + Height + ", CalBMI=" + CalBMI + '}';
    }
    
    
}
