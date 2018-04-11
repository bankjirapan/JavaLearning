
package carforrent.model;

/**
 *
 * @author bankcom
 */
public class RentCar extends Car{
    
    private Car[] car;

    public RentCar(Car[] car) {
        this.car = car;
    }

    public RentCar(Car[] car, String nameCar, String TypeCar) {
        super(nameCar, TypeCar);
        this.car = car;
    }
    
   
    
    
    
    
    
}
