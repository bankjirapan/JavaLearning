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
public abstract class Square implements ShapeInterface{

    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
     public  double findArea(){
         return side*side;
     }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + '}';
    }
    
    
    
}
