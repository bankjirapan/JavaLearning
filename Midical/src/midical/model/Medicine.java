/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midical.model;

/**
 *
 * @author INT105
 */
public abstract class Medicine implements Medical {

    private int medicineId;
    private String name;
    private String ingredients;

    public Medicine() {
    }

    public int getMedicineId() {
        return medicineId;
    }
    
    public String medicalProperties(){
        return this.ingredients;
    }
    public String medicalIngreddients(){
        return this.ingredients;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Medicine{" + "medicineId=" + medicineId + ", name=" + name + ", ingredients=" + ingredients + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
