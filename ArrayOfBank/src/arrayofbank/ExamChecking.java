package arrayofbank;

public class ExamChecking {

    public static void main(String[] args) {

        System.out.println("Hello world");
        char[] stdA = {'A', 'B', 'C', 'C', 'C'};
        char[] solA = {'B', 'B', 'C', 'C', 'B'};

        System.out.println(examCheck(stdA, solA));

    }

    public static int examCheck(char[] stdAnswer, char[] solAnswer) {
        int result = 0;

        int solLenght = solAnswer.length;
        int stdLenght = stdAnswer.length;

        if (stdLenght < solLenght) {

            for (int i = 0; i < stdAnswer.length; i++) {

                if (stdAnswer[i] == solAnswer[i]) {
                    result = result + 2;
                } else if (stdAnswer != solAnswer) {
                    result = result - 1;
                }
            }

            for (int b = stdLenght; b < solLenght; b++) {
                result = result - 1;

            }

        } else if (stdLenght > solLenght) {

            for (int i = 0; i < solAnswer.length; i++) {

                if (stdAnswer[i] == solAnswer[i]) {
                    result = result + 2;
                } else if (stdAnswer != solAnswer) {
                    result = result - 1;
                }
            }

            for (int b = solLenght; b < stdLenght; b++) {
                result = result - 1;

            }

        } else {

            for (int i = 0; i < solLenght; i++) {

                if (stdAnswer[i] == solAnswer[i]) {
                    result = result + 2;
                }else{
                        result = result - 1;
                }

            }

        }

        return result;
    }

}
