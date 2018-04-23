/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package self.model;

/**
 *
 * @author bankcom
 */
public class test {

    public static void main(String[] args) {
        int Bath = 0;
        int usePoints = 2000;
        int points = 20000;
        int sdddd = 2000;
        int aaaa = 0;
        if (usePoints > points) {
            System.out.println("Your point are not enough");
            System.out.println("-1");
        } else if (usePoints <= points) {
            
            if(usePoints % 800 == 0){
                while (usePoints >= 800) {

                usePoints = usePoints - 800;
           
                 
                Bath++;
            }
            } else {
                System.out.println(usePoints%800);
            }
            
            //System.out.println(usePoints);
            //System.out.println(Bath*100);

            //System.out.println((points - usePoints)-Bath*100);

        }

    }

}
