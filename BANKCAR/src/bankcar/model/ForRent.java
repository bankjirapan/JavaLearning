/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcar.model;

/**
 *
 * @author bankcom
 */
public abstract class ForRent extends Car{
    
    private String Brand;
    private String Models;
    private String Color;
    private String DateForRent;
    private String nameCar;
    private String typeCar;

    public ForRent(String Brand, String Models, String Color, String DateForRent, String nameCar, String typeCar) {
        this.Brand = Brand;
        this.Models = Models;
        this.Color = Color;
        this.DateForRent = DateForRent;
        this.nameCar = nameCar;
        this.typeCar = typeCar;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModels() {
        return Models;
    }

    public void setModels(String Models) {
        this.Models = Models;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getDateForRent() {
        return DateForRent;
    }

    public void setDateForRent(String DateForRent) {
        this.DateForRent = DateForRent;
    }

    public String getNameCar() {
        return nameCar;
    }

    public void setNameCar(String nameCar) {
        this.nameCar = nameCar;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }
    
    

    @Override
    public String toString() {
        return "ForRent{" + "Brand=" + Brand + ", Models=" + Models + ", Color=" + Color + ", DateForRent=" + DateForRent + '}';
    }
    
    
    
    
    
    
}
