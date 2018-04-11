/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banktour;

import java.util.Scanner;

/**
 *
 * @author bankcom
 */
public class BankTour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int select;
        int select_other;
        // สร้างตัวแปรเพื่อเก็บค่า Message;
        String message;
        String message_other = null;
        double personal;
        double day_other_hire = 0;
        double price_posonal;
        double other_price_posonal = 0;
        int c_day;
        double hire_car = 0;
        int d_hire = 0;
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("ยินดีต้อนรับสู่ แบงค์ทัวร์ ทัวร์ทุกที่ที่มีเส้นทาง \n-----------------------------");
        System.out.println("รายการทัวร์ของเรามีดังนี้" + "\n"
                + "1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน (6 วัน 5 คืน)\n"
                + "2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 45,000 บาท / คน (6 วัน 5 คืน)\n"
                + "3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 46,000 บาท / คน (6 วัน 5 คืน)\n"
                + "4) แพคเกจทัวร์ประเทศโมนาโก ราคา 51,000 บาท / คน (6 วัน 5 คืน)\n"
                + "5) แพคเกจทัวร์ประเทศสเปน ราคา 55,000 บาท / คน (6 วัน 5 คืน) \n-----------------------------");
        System.out.println("กรุณาเลือกรายการทัวร์ที่ต้องการ เช่น แพคแกจทัวร์สเปน ให้ท่านใส่ (5)");
        System.out.print("เลือกรายการ : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                message = "1) แพคเกจทัวร์ประเทศโปรตุเกส ราคา 50,000 บาท / คน (6 วัน 5 คืน)";
                break;
            case 2:
                message = "2) แพคเกจทัวร์ประเทศบัลแกเรีย ราคา 45,000 บาท / คน (6 วัน 5 คืน)";
                break;
            case 3:
                message = "3) แพคเกจทัวร์ประเทศโปแลนด์ ราคา 46,000 บาท / คน (6 วัน 5 คืน)";
                break;
            case 4:
                message = "4) แพคเกจทัวร์ประเทศโมนาโก ราคา 51,000 บาท / คน (6 วัน 5 คืน)";
                break;
            case 5:
                message = "5) แพคเกจทัวร์ประเทศสเปน ราคา 55,000 บาท / คน (6 วัน 5 คืน) ";
                break;
            default:
                message = "Not found your tour";
                break;
        }
        
            System.out.println("คุณได้เลือกทัวร์ : "+message);
            
            System.out.print("กรุณาใส่จำนวนคนที่ต้องการ ทัวร์ : ");
            
            personal = input.nextDouble();
            
          //Cheack ว่าเป็นทัวร์อะไร
          if(select == 1){
              price_posonal = personal * 50000;
          } else if(select == 2){
              price_posonal = personal * 45000;
          } else if(select == 3){
              price_posonal = personal * 46000;
          } else if(select == 4){
              price_posonal = personal * 51000;
          } else if(select == 5){
              price_posonal = personal * 55000;
          } else {
              price_posonal = '0';
          }
          
   
          String qustion;
          System.out.println("\n-------ท่านต้องการเช่ารถหรือไม่ โดยบริการของเราคิดเพียงวันละ 2000 บาทเท่านั้น (ตอบ : ใช่ หรือ ไม่)-------");
          System.out.print("คำตอบ : ");
          
          qustion = input.next();
          if(qustion.equals("ใช่")){
              System.out.print("ท่านต้องการเช่ารถกี่วัน : "); d_hire = input.nextInt(); 
              hire_car = d_hire*2000;
          }else {
              System.out.println("****คุณไม่จองรถ*****");
          }
          
          String qustion_other;
           System.out.println("\n\n---------ท่านต้องการเช่าห้องพักเพิ่มเติมหรือไม่ (ตอบ : ใช่ หรือ ไม่)----");
             System.out.print("คำตอบ : ");
           qustion_other = input.next();
              if(qustion_other.equals("ใช่")){
                  System.out.println("เรามีแพกเก็ตให้ท่านเลือกดังนี้");
                  System.out.println("ห้องพักเพิ่มเติม โดยมีอัตราค่าบริการในแต่ละแพคเกจเพิ่มเติมดังนี้ โดยระบุได้ว่าต้องการเช่ากี่วัน\n" +
"     1) สำหรับแพคเกจทัวร์ประเทศโปรตุเกส ราคา 2,000 บาท / ต่อวัน / ห้อง\n" +
"     2) สำหรับแพคเกจทัวร์ประเทศบัลแกเรีย ราคา 1,500 บาท / ต่อวัน / ห้อง\n" +
"     3) สำหรับแพคเกจทัวร์ประเทศโปแลนด์ ราคา 1,200 บาท / ต่อวัน / ห้อง\n" +
"     4) สำหรับแพคเกจทัวร์ประเทศโมนาโก ราคา 1,600 บาท / ต่อวัน / ห้อง\n" +
"     5) สำหรับแพคเกจทัวร์ประเทศสเปน ราคา 2,100 บาท / ต่อวัน / ห้อง");
        System.out.print("เลือกรายการ : ");
        select_other = input.nextInt();
       
        switch (select_other) {
            case 1:
                message_other = "1) สำหรับแพคเกจทัวร์ประเทศโปรตุเกส ราคา 2,000 บาท / ต่อวัน / ห้อง";
                break;
            case 2:
                message_other = "2) สำหรับแพคเกจทัวร์ประเทศบัลแกเรีย ราคา 1,500 บาท / ต่อวัน / ห้อง";
                break;
            case 3:
                message_other = "3) สำหรับแพคเกจทัวร์ประเทศโปแลนด์ ราคา 1,200 บาท / ต่อวัน / ห้อง";
                break;
            case 4:
                message_other = "4) สำหรับแพคเกจทัวร์ประเทศโมนาโก ราคา 1,600 บาท / ต่อวัน / ห้อง";
                break;
            case 5:
                message_other = "5) สำหรับแพคเกจทัวร์ประเทศสเปน ราคา 2,100 บาท / ต่อวัน / ห้อง ";
                break;
            default:
                message_other = "Not found your tour";
                break;
        }
         
         System.out.println("คุณได้เลือกห้องพัก : "+message_other);
            
            System.out.print("กรุณาใส่จำนวนวันที่ต้องการเข้าพัก : ");
            
            day_other_hire = input.nextDouble();
         //Cheack ว่าเป็นทัวร์อะไร
          if(select_other == 1){
              other_price_posonal = day_other_hire * 2000;
          } else if(select_other == 2){
              other_price_posonal = day_other_hire * 1500;
          } else if(select_other == 3){
              other_price_posonal = day_other_hire * 1200;
          } else if(select_other == 4){
              other_price_posonal = day_other_hire * 1600;
          } else if(select_other == 5){
              other_price_posonal = day_other_hire * 2100;
          } else {
              other_price_posonal = '0';
          }
          
              }else{
                  System.out.println("****คุณไม่จองห้องพักเพิ่มเติม****");
                 
              }
              
               System.out.println("\n----สรุปรายการของคุณ----");
               System.out.println("คุณได้เลือกทัวร์ :"+message);
               System.out.println("โดยไปกันทั้งหมด :"+personal+" คน");
               System.out.println("ราคา :"+price_posonal+" บาท");
               
              if(qustion == "ใช่"){
                  System.out.println("คุณได้จองรถจำนวน : "+d_hire+" วัน"); 
                  System.out.println("ราคา : "+hire_car+" บาท");
              } else {
                  System.out.println("คุณไม่ได้จองรถ");
              }
               
              if(qustion_other.equals("ใช่")){
                  System.out.println("คุณเช่าห้องพักเพิ้มตเติม :"+message_other); 
                  System.out.println("โดยคุณพักที่นี้ :"+day_other_hire+" วัน");
                  System.out.println("ราคา :"+other_price_posonal+" บาท");
              } else {
                  System.out.println("คุณไม่ได้เช่าห้องพัก");
              }
              System.out.println("=========================================");
              double sum_tour = (price_posonal+hire_car+other_price_posonal);
              
              System.out.println("ยอดรวมที่ต้องชำระทั้งหมด : "+sum_tour+"\nPayment total : "+sum_tour);
               
               
               
          
         //System.out.println(""+message+"\nจำนวนคน :" +personal+"\nยอดที่ต้องชำระ :"+price_posonal+"");
        
    }
    

}
