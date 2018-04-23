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
public class Square2 extends Square{

    public Square2() {
    }

    public Square2(double side) {
        super(side);
    }
    public  double findCircumference(){
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return "Square2{" + '}';
    }
    
    
    
}
