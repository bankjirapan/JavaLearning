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
public abstract class Circle extends Snape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, int shapeId) {
        super(shapeId);
        this.radius = radius;
    }

 
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}'+super.toString();
    }
    
    

    public double getRadius() {
        return radius;
    }
  
    public double findArea() {
        return Math.PI * Math.pow(radius, radius);
    }

}
