/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractlearning.model;

/**
 *
 * @author INT105
 */
public abstract class Snape {

    protected int shapeId;

    public Snape() {
    }

    
    public Snape(int shapeId) {
        this.shapeId = shapeId;
    }

    @Override
    public String toString() {
        return "Snape{" + "shapeId=" + shapeId + '}';
    }
    
    
    
    public abstract double findArea(); //No implement

    public abstract double findCircumference();

 
}
