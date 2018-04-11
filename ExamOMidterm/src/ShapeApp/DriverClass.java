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
public class DriverClass {

    public static void main(String[] args) {
        Shape shapesA = new Circle(3);
        Shape shapesB = new Rectangle(4, 5);

        System.out.println(shapesA.toString());
        System.out.println(shapesB.toString());
    }
}
