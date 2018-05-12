/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icomcare.model;

/**
 *
 * @author bankcom
 */
public class ShowSameData extends addRepair{

    public ShowSameData(int numOfItem, String nameCustomer) {
        super(numOfItem, nameCustomer);
    }

    @Override
    public String toString() {
        return "\n หมายเลขแจ้งซ่อม : "+super.getNumOfItem()+" ชื่อคุณลูกค้า : "+super.getNameCustomer()+"\n";
    }

    
    

  
    
    
}