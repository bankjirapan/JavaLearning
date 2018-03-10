package arrayexam;

/**
 *
 * @author bankcom
 */
public class ArrayBySafe {

    public static void main(String[] args) {
        //ประกาศตัวแปรเอาไว้บวก
        int a = 1;
                
        //สร้าง Array num1 กับ num2 มา 4 ช่อง
        int[] num1 = new int[4];
        int[] num2 = new int[4];
        
        
        
        //for loop 
        for (int i = 0; i < num1.length; i++) {
            num1[i] = a++;

            System.out.print(num1[i] + " ");

        }
        
        //Enter line to buttom;
        System.out.println("");

        
        //Num1 cell at one + Num2 cell at Two
        for (int t = 0; t < num1.length; t++) {
            num2[t] = num1[t] + num1[t];
            System.out.print(num2[t] + " ");
        }

    }
}
