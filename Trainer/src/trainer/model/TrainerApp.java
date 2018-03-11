package trainer.model;

/**
 *
 * @author bankcom
 */
public class TrainerApp {

    private String name;
    private int kcal;
    private int weight;
    private Exercise exercise;
    private EatingFood eating;

    public TrainerApp(String name, int kcal, int weight) {
        this.name = name;
        this.kcal = kcal;
        this.weight = weight;
    }
    
    public int exerciseCourse(char type){
        return 0;
    }
    
    public int exerciseSpacific(String type,int amount){
        return 0;
    }

    
    
}
