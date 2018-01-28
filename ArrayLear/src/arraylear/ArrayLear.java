package arraylear;

/**
 *
 * @author bankcom
 */
public class ArrayLear {

    public static void main(String[] args) {

        int even = 0;
        int odd = 0;

        int bank[] = new int[10];

        //int bank[] = (int)(Math.random()*10-1+1)+1;
        for (int num = 0; num < bank.length; num++) {
            bank[num] = (int) (Math.random() * 10 - 1 + 1) + 1;
        }

        //Chack ค่าว่าเป็นเลขคู่หรือเลขคี่
        for (int Result : bank) {
            if (Result % 2 == 0) {
                   even++;
            } else {
                odd++;
            }
        }
        
        System.out.println("Num of even "+ even);
        System.out.println("Num of odd "+ odd);

    }

}
