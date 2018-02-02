package arrayofbank;

/**
 *
 * @author bankcom
 */
public class ArrayOfBank {

    public static void main(String[] args) {

        System.out.println("Hello Array");

        int NumberOne[] = new int[10];
        int A = 0;

        //Set array 3
        for (int random = 0; random < NumberOne.length; random++) {
            NumberOne[random] = (int) (Math.random() * (10 - 1) + 1) + 1;

        }
        for (int i = 0; i < NumberOne.length; i++) {
            if (NumberOne[i] != 0) {

                if (NumberOne[i] >= A) {
                    A = NumberOne[i];
                    NumberOne[0] = A;
                    
                }
               NumberOne[i] = 0;

            } else {
                System.out.println("Error software");
            }
        }
        
        for(int a : NumberOne){
            System.out.println(a);
        }
      

        System.out.println(A);

    }

}
