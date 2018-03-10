package arrayexam;

/**
 *
 * @author bankcom
 */
public class ArrayBySafe {

    public static void main(String[] args) {

        int a = 1;
        int[] num1 = new int[4];
        int[] num2 = new int[4];

        for (int i = 0; i < num1.length; i++) {
            num1[i] = a++;

            System.out.print(num1[i] + " ");

        }
        System.out.println("");

        for (int t = 0; t < num1.length; t++) {
            num2[t] = num1[t] + num1[t];
            System.out.print(num2[t] + " ");
        }

    }
}
