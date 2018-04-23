/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShapeApp;

/**
 *
 * @author bankcom
 */
public class Rectangle extends Shape {

    private double Area;
    private double Peremeter;

    public Rectangle(double Area, double Peremeter) {
        super.setArea(Area * Peremeter);
        super.setPeremeter((Area + Area) + (Peremeter + Peremeter));
    }

}
