package SITSchool;

import java.util.Scanner;

/**
 *
 * @author bankcom
 */
public class SitSchool {

    public static void main(String[] args) {

        int numStd;
        String nameStd;
        int StdID;
        double ScoreStd;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to SIT School");

        System.out.print("Enter num of Student : ");
        numStd = sc.nextInt();

        SitStudent std[] = new SitStudent[numStd];

        for (int num = 0; num < std.length; num++) {
            System.out.println("Number : " + (num + 1));

            System.out.print("Enter your name : ");
            nameStd = sc.next();

            System.out.print("Enter Score : ");
            ScoreStd = sc.nextDouble();

            std[num] = new SitStudent(nameStd, ScoreStd);

        }

        System.out.println("SIT Have student : " + SitStudent.getNumofStudent());

        for (int i = 0; i < std.length; i++) {
            System.out.println(std[i].toString());

        }
        
        System.out.println(highestScore(std));

    }
    
     public static String highestScore(SitStudent[] std){
        double highScore = std[0].getScore();
        
         System.out.println(highScore);
        /*
        int index = 0;
        for(int i=0;i<std.length;i++){
            if(std[i].getScore()>highScore){
                index = i;
            }
        }
        return "The Student named "+std[index].getNameStd()+" get Highest Scores = "+std[index].getScore();

*/
    }

}
