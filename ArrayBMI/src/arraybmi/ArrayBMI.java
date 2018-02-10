package arraybmi;

/**
 *
 * @author bankcom
 */
public class ArrayBMI {

    /**
     * ≠≠
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        BMI Bank = new BMI("BANK", 47, 165);

        System.out.println(Bank);

    }

    public static String[] bmiStudent(BMI bmi[]) {
        String[] NumofStudent = new String[bmi.length];

        for (int i = 0; i < NumofStudent.length; i++) {
            NumofStudent[i] = BMI_Cat(bmi[i]);
        }
        return NumofStudent;
    }

    public static String BMI_Cat(BMI bmi) {
        String bmiCategory;
        if (bmi.getCalBMI() < 0) {
            bmiCategory = "none";
        } else if (bmi.getCalBMI() < 18.5) {
            bmiCategory = "under weight";
        } else if (bmi.getCalBMI() < 25) {
            bmiCategory = "normal weight";
        } else if (bmi.getCalBMI() < 30) {
            bmiCategory = "over weight";
        } else {
            bmiCategory = "obesity";
        }
        return bmiCategory;
    }
}
