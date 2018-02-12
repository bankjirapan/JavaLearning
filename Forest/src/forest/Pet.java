/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forest;

/**
 *
 * @author INT105
 */
public class Pet {
    
    private String ownerName;
    private Animal animal;

    public Pet(String ownerName, Animal animal) {
        this.ownerName = ownerName;
        this.animal = animal;
    }

    public Pet() {
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Pet{" + "ownerName=" + ownerName + ", animal=" + animal + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
