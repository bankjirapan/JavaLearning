/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependency;

/**
 *
 * @author bankcom
 */
import dependency.SITINFO;
import dependency.SITAddress;
import java.util.Scanner;

public class TestSIT {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numStd;

        String tempHouseNo;
        String tempStreet;
        String tempDistract;
        String tempprovices;
        String tempZipcode;
        
        long tempID;
        int gard;
        
        
       // SITAddress AddressSIT1 = new SITAddress("30/1","Ratchasid","Sukumvit","Bangkok","10130");
       // SITINFO SIT1 = new SITINFO(3,60130500012l,AddressSIT1);
        /* 
        System.out.println(SIT1);

         */

        System.out.println("Register My of Course");
        System.out.print("Enter your num student : ");
        numStd = sc.nextInt();

        SITAddress Addr[] = new SITAddress[numStd];
        SITINFO SITinfo[] = new SITINFO[numStd];

        for (int numSit = 0; numSit < Addr.length; numSit++) {

            System.out.print("Enter your id : ");
            tempID = sc.nextLong();
            
             System.out.print("Enter your Point : ");
            gard = sc.nextInt();

           

            System.out.print("HouseNO : ");
            tempHouseNo = sc.next();
            System.out.print("Steet : ");
            tempStreet = sc.next();
            System.out.print("Distract : ");
            tempDistract = sc.next();
            System.out.print("Provice : ");
            tempprovices = sc.next();
            System.out.print("Zipcode : ");
            tempZipcode = sc.next();

            //SITinfo[numSit].setSITAddr(tempHouseNo, tempStreet, tempDistract, tempprovices,tempZipcode);
           //info[numSit].setSITAddr(SITAddr);
           SITAddress AddressSIT = new SITAddress(tempHouseNo, tempStreet, tempDistract, tempprovices,tempZipcode);
        
           SITinfo[numSit] = new  SITINFO(gard,tempID,AddressSIT);
        }
        
      
        for(int i=0; i<SITinfo.length; i++){
            System.out.println("Student:"+(i+1)+SITinfo[i].toString());
        }

    }

}
