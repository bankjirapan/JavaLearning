
import trainer.model.EatingFood;
import trainer.model.Ellptical;
import trainer.model.Exercise;
import trainer.model.TreadMill;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestTrainerApp {

    private TreadMill treadmill = new TreadMill();
    private Ellptical elliptical = new Ellptical();
    private Exercise exercise = new Exercise();
    private EatingFood eatingFood = new EatingFood();

    public TestTrainerApp() {
    }

    //---------------------TestMethod:Exercise----------------------------
    @Test
    public void testHelpMetabolismInTreadmill() {
        int expectResult = 350;
        int result = treadmill.helpMetabolism();
        assertEquals(expectResult, result);
    }

    @Test
    public void testHelpMetabolismInElliptical() {
        int expectResult = 400;
        int result = elliptical.helpMetabolism();
        assertEquals(expectResult, result);
    }

    @Test
    public void testCourseA() {
        int expectResult = 550;
        int result = exercise.courseA();
        assertEquals(expectResult, result);
    }

    @Test
    public void testCourseB() {
        int expectResult = 540;
        int result = exercise.courseB();
        assertEquals(expectResult, result);
    }

    @Test
    public void testPlayTreadmill() {
        int expectResult = 700;
        int result = exercise.playTreadmill(120);
        assertEquals(expectResult, result);
    }

    @Test
    public void testPlayElliptical() {
        int expectResult = 266;
        int result = exercise.playElliptical(40);
        assertEquals(expectResult, result, 1);
    }

    @Test
    public void testSitup() {
        int expectResult = 25;
        int result = exercise.sitUp(50);
        assertEquals(expectResult, result);
    }

    //------------------------TestMethod:Food----------------------------
    @Test
    public void testGetEnergy() {
        int expectResult = 400;
        int result = eatingFood.getEnergy();
        assertEquals(expectResult, result);
    }

    @Test
    public void testGetEnergyMore() {
        int expectResult = 7000;
        int result = eatingFood.getEnergyMore();
        assertEquals(expectResult, result);
    }

}
/*Jatawatsafe*/
