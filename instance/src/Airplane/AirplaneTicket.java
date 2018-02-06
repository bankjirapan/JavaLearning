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
public class AirplaneTicket extends Ticket {

    private String ticketType;
    private String seatNo;
    private String classType;

    public AirplaneTicket(String ticketType, String seatNo, String classType, int TicketPrice, double TicketTime) {
        super(TicketPrice, TicketTime);
        this.ticketType = ticketType;
        this.seatNo = seatNo;
        this.classType = classType;
    }

    public AirplaneTicket(String ticketType, String seatNo, String classType) {
        this.ticketType = ticketType;
        this.seatNo = seatNo;
        this.classType = classType;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getClassType() {
        return classType;
    }

    @Override
    public int getTicketPrice() {
        if (classType.equals("Economy")) {
            return this.TicketPrice - 10000;

        } else if (classType.equals("Business")) {
            return this.TicketPrice;
        } else {
            return this.TicketPrice;
        }

    }
    
    public boolean equals(Object obj){
        AirplaneTicket temp = null;
        
        //เช็คลูกหลาน instanceof AirplaneTicket
        if(obj != null && obj instanceof AirplaneTicket){
           
            temp=(AirplaneTicket)obj;
            
            if(ticketType.equalsIgnoreCase(temp.ticketType) && classType.equalsIgnoreCase(temp.classType)){
                return true;
            }
            
            
        }
        return false;
    }

    @Override
    public String toString() {
        return "airplaneTicket{" + "ticketType=" + ticketType + ", seatNo=" + seatNo + ", classType=" + classType + " TicketPrice=" + getTicketPrice() + " TicketTime=" + getTicketTime() + '}';
    }

}
