/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package answer;

/**
 *
 * @author bankcom
 */
public class Answer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        
//     int aa[] = new int[5];
//     
//     
//     
//        for(int i=0;i <aa.length; i++){
//            
//            aa[i] = (int)(Math.random()* 10 -1+1)+1;
//            
//            
//        }
//        
//        
//        
//        for(int a:aa){
//            System.out.println(a);
//        }
        //int bank,lali[],aim;
        char stdAnswer[] = new char[]{'A', 'B', 'C', 'D', 'A'};
        char solAnswer[] = new char[]{'B', 'C', 'D', 'A', 'B'};
        
        int countCorrect = 0;
        for(int i=0; i<solAnswer.length;i++){
            if(stdAnswer[i] == solAnswer[i]){
                countCorrect++;
            }
        }

    }

}
