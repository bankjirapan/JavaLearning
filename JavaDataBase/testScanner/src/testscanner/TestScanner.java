
package testscanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestScanner {

    public static void main(String[] args) {
        /*
       String myMg = "Mango Grape Apple Guave";
       Scanner sc = new Scanner(myMg);
       
       int sum = 0;
       
       //has คือมีคำที่อ่านต่อไปมั้ย return true
       while(sc.hasNext()){
           System.out.println(sc.next());
           sum++;
       }
       
        System.out.println(sum);
    }
*/
        int num = 0,word = 0,numOflenght = 0;
        ArrayList<Student> stdList = new ArrayList<Student>();

        try{
            File myFiles =  new File("StudentList.txt");
            Scanner sc = new Scanner(myFiles);
            
            while(sc.hasNext()){
                String line = sc.nextLine();
                num++;
                
                //System.out.println(line);
                
                Scanner scStr = new Scanner(line);
                
                while(scStr.hasNext()){
                    
                    int id = scStr.nextInt();
                    String fname= scStr.next();
                    String lname = scStr.next();
                    
                    Student std = new Student(id,fname,lname);
                    //เรียกใช้ Class Array List
                    stdList.add(std);
                    word++;
                    //System.out.println(scStr.next());
                          
                }
                
                for(int i=0; i<line.length(); i++){
                  numOflenght++;
                }
                
            }
            
 /*
            System.out.println("num of Line = "+num);
            System.out.println("num of word = "+word);
            System.out.println("num of wordLenght = "+numOflenght);
       */

} 
        catch(FileNotFoundException ff){
            System.out.println(ff);
        }
        
        for (Student student : stdList){
            System.out.println(student);
        }
       
    }
}
