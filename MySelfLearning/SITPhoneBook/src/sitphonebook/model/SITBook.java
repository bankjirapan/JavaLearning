/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitphonebook.model;

/**
 *
 * @author bankcom
 */
public class SITBook {
    
    
    private int numSIT;
    private String name;
    private String Phone;

    public SITBook() {
    }

    public SITBook(int numSIT, String name, String Phone) {
        this.numSIT = numSIT;
        this.name = name;
        this.Phone = Phone;
    }

    public int getNumSIT() {
        return numSIT;
    }

    public void setNumSIT(int numSIT) {
        this.numSIT = numSIT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Override
    public String toString() {
        return "SITBook{" + "numSIT=" + numSIT + ", name=" + name + ", Phone=" + Phone + '}';
    }

    
    
    
}
