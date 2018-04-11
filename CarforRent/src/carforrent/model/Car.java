
package carforrent.model;

/**
 *
 * @author bankcom
 */
public class Car {
    
    private String nameCar;
    private String TypeCar;

    public Car() {
    }

    public Car(String nameCar, String TypeCar) {
        this.nameCar = nameCar;
        this.TypeCar = TypeCar;
    }

    
    
    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getTypeCar() {
        return TypeCar;
    }

    public void setTypeCar(String TypeCar) {
        this.TypeCar = TypeCar;
    }

    @Override
    public String toString() {
        return "Car{" + "nameCar=" + nameCar + ", TypeCar=" + TypeCar + '}';
    }
    
    
    
    
    
}
