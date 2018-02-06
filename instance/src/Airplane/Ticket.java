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
public class Ticket {
    
    
    protected int TicketPrice;
    private double TicketTime;

    public Ticket(int TicketPrice, double TicketTime) {
        this.TicketPrice = TicketPrice;
        this.TicketTime = TicketTime;
    }

    public Ticket() {
    }

    public int getTicketPrice() {
        return TicketPrice;
    }

    public void setTicketPrice(int TicketPrice) {
        this.TicketPrice = TicketPrice;
    }

    public double getTicketTime() {
        return TicketTime;
    }

    public void setTicketTime(double TicketTime) {
        this.TicketTime = TicketTime;
    }

    @Override
    public String toString() {
        return "Ticket{" + "TicketPrice=" + TicketPrice + ", TicketTime=" + TicketTime + '}';
    }

    
    
    
    
}
