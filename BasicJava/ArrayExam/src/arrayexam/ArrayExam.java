package arrayexam;

/**
 *
 * @author bankcom
 */
public class ArrayExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }

    public static int[] findMinMax(int score[]) {
        int maxValue = 0;
        int minValue = 100;

        int result[] = new int[2];
        for (int i = 0; i < score.length; i++) {

            if (score[i] > 100 || score[i] < 0) {
                return null;

            } else {

                if (score[i] > maxValue) {
                    maxValue = score[i];
                }

                if (score[i] < minValue) {
                    minValue = score[i];
                }

            }
        }

        result[0] = minValue;
        result[1] = maxValue;

       
        return result;
    }

}
