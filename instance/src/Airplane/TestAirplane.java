/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Airplane;

/**
 *
 * @author bankcom
 */
public class TestAirplane {

    public static void main(String[] args) {
        AirplaneTicket ticket = new AirplaneTicket("Airplane", "A3", "Business", 35000, 16.00);

        System.out.println(ticket);

        AirplaneTicket airplane = new AirplaneTicket("NokAir", "A3", "Business", 40000, 17.00);

        System.out.println(airplane.equals(ticket));

    }

}
