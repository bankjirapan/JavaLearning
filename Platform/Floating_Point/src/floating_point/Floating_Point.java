package floating_point;

/**
 *
 * @author bankcom
 */
public class Floating_Point {

    public static void main(String[] args) {

        System.out.println("Hello to FloatPoint");

        
        //ประกาศตัวแปร float
        float myFloat;

        //กำหนดค่าให้กับ MyFloat
        System.out.println("กำหนดค่าให้กับ myFloat");
        myFloat = 1.23456789f;

        //แสดงผล My float ออกมา
        System.out.print("Print myFloat = ");
        System.out.println(myFloat);

        System.out.println("==================");

        System.out.println("Set New My float");

        myFloat = 12.23456789f;

        System.out.print("New MyFloat = ");
        System.out.println(myFloat); //เลขถูกปัดทศนิยม
        System.out.println("==================");

        System.out.println("Cancellation Error");

        float number1 = 1 + 1.234e-5f - 1;
        double number2 = 1 + 1.234e-5f - 1;

        System.out.println("Float : 1+1.234e-5f-1 = " + number1); //ถูกตัดจำนวน
        System.out.println("double : 1+1.234e-5f-1 = " + number2);

        System.out.println("==================");

        
        //
        float highfloat;
        highfloat = Float.MAX_VALUE;

        System.out.println("HighFloat = " + highfloat);

        System.out.println("HighFloat ^2 = " + highfloat * 2);

        System.out.println("==================");

        float lowfloat;
        lowfloat = Float.MIN_VALUE;

        System.out.println("MIN Float = " + lowfloat);
        System.out.println("Divide 2 = " + lowfloat / 2);

        System.out.println("==================");

        float divFloat1 = (float) 1 / 0;
        float divFloat2 = (float) 0 / 0;
        float sqrtFloat = (float) (Math.sqrt(-1));

        System.out.println("2.Value of divFloat1 = " + divFloat1);
        System.out.println("3.Value of divFloat2 = " + divFloat2);
        System.out.println("4.Value of sqrtFloat = " + sqrtFloat);
        System.out.println("5.Variables\tis NaN");
        System.out.println("divFloat1:\t" + (divFloat1 != divFloat1) + "\t" + (Float.isNaN(divFloat1)));
        System.out.println("divFloat2:\t" + (divFloat2 != divFloat2) + "\t" + (Float.isNaN(divFloat2)));
        System.out.println("sqrtFloat:\t" + (sqrtFloat != sqrtFloat) + "\t" + (Float.isNaN(sqrtFloat)));

    }

}
