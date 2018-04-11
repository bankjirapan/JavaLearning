package learning161160;

/**
 *
 * @author bankcom
 */
import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {

        System.out.println("Welcome to chack spac your phone \n -------------------");
        System.out.print("Enter your phone :  ");

        Scanner name_phone = new Scanner(System.in);

        String namephone = name_phone.next();

        //Chack if 
        //บังคับให้เป็นตัวเล็ก
        String namephone_low = namephone.toLowerCase();
        System.out.println("==============================");
         System.out.println("Space of "+ namephone_low+"\n==============================");   
        if (namephone_low.equals("iphone5s")) {
System.out.println("A7 chip 64 bit\n"
                    + "4 Inch Retina display\n"
                    + "8 megapixels camera\n"
                    + "M7 coprocessor\n"
                    + "Fingerprint Identity Sensor");
        } else if(namephone_low.equals("iphone6s")) {
             //System.out.println("can't not found "+namephone);
             System.out.println("ชีพียู A9 พร้อมสถาปีตยกรรม 64 บิต และ M9 สำหรับประมวลการเคลี่ยนไหว\n" +
"Ram 2 GB\n" +
"หน่วยความจำ 16,64,128 GB\n" +
"หน้าจอ retina HD พร้อม 3D Touch ขนาด 4.7 นิ้ว ความละเอียด 1334×750 พิกเซล\n" +
"กล้องความละเอียด 12 MP ขนาด 1.22µ, f/2.2\n" +
"กล้องหน้าความละเอียด 5 MP f/2.2\n" +
"วิดิโอ 4K (3840×2160) ที่ 30 เฟรมต่อวิ , Full HD (1920×1080) ที่ 30 และ 60 เฟรมต่อวิ, HD (1280×720) ที่ 30 เฟรมต่อวิ สำหรับกล้องหลัง และ HD (1280×720) ที่ 30 เฟรมต่อวิ สำหรับกล้องหน้า\n" +
"แบต 1715 mAh\n" +
"LTE Advanced ความเร็ว 300/50 Mbps, Wifi มาตรฐาน A/B/G/N/AC พร้อม MIMO ที่ความเร็ว 866 Mbps\n" +
"Bluetooth 4.2, NFC\n" +
"Nano Sim\n" +
"การเล่นเสียง ACC, HE,ACC, MP3,MP3 VBR, Audible,Apple Lossless, AIFF และ WAV\n" +
"เซ็นเซอร์ลายนิ้วมือ Touch ID,บารอมิเตอร์,Gyro 3 แกน,ระบบปรับความสว่างหน้าจออัตโนมัติ\n" +
"เชื่อมต่อผ่าน Lightning cable\n" +
"ขนาด 138.3 x 67.1 x 7.1 ชม.(ยาวxกว้างxหนา)\n" +
"นำ้หนัก 143 กรัม");
        } else if(namephone.equals("iphone8")){
            
        }

    }

    public static double aaa() {
        char bank;
        bank = 123;
        return bank;
    }

}
