/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toursiam.model;

/**
 *
 * @author bankcom
 */
public abstract class tour {
    
    private String name;
    private String Tour;
   

    public tour(String name, String Tour) {
        this.name = name;
        this.Tour = Tour;
    }
    
    
    public abstract String Goto();

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTour() {
        return Tour;
    }

    public void setTour(String Tour) {
        this.Tour = Tour;
    }
    
    
    
 
    
    
    
}
