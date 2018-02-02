
package Calculator_Point;

/**
 *
 * @author bankcom
 */
import java.util.Scanner;
public class grads {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Calculator gards");
        
        int in_point;
        
        int point[] = new int[5];
        
        for(int i=0; i<point.length;i++){
            System.out.print("Enter point : ");
           point[i] = in_point = sc.nextInt();
            
        }
        
        for(int n : point){
            System.out.println(n);
        }
        
        
    }
    
}
