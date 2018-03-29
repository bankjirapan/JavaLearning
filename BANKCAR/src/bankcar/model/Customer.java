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
public class Customer extends ForRent {

    private ForRent[] rent;

    private String name;
    private String Addr;
    private String Street;
    private String zipCode;
    private String nameCar;
    private String typeCar;

    public Customer(
            ForRent[] rent, 
            String name,
            String Addr, 
            String Street, 
            String zipCode, 
            String Brand, 
            String Models, 
            String Color, 
            String DateForRent, 
            String nameCar,
            String typeCar
    ) {
        super(Brand, Models, Color, DateForRent, nameCar, typeCar);
        this.rent = rent;
        this.name = name;
        this.Addr = Addr;
        this.Street = Street;
        this.zipCode = zipCode;
        this.nameCar = nameCar;
        this.typeCar = typeCar;
    }

    public  String nameCar(){
       return this.nameCar;
    }

    public  String typeCar(){
       return this.typeCar;
    }

    //ส่วนของ Car ที่ Exten
    public ForRent[] getRent() {
        return rent;
    }

    public void setRent(ForRent[] rent) {
        this.rent = rent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return Addr;
    }

    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Customer{" + "rent=" + rent + ", name=" + name + ", Addr=" + Addr + ", Street=" + Street + ", zipCode=" + zipCode + ", nameCar=" + nameCar + ", typeCar=" + typeCar + '}';
    }

    
    
}
