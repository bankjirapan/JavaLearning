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
        this.exercise = new Exercise();
        this.eating = new EatingFood();
    }

    public int exerciseCourse(char type) {

        if (type == 'A') {

            if (kcal - exercise.courseA() <= 1200) {
                return -1;
            } else {
                kcal = kcal - exercise.courseA();
            }

        } else if (type == 'B') {
            if (kcal - exercise.courseB() <= 1200) {
                return -1;
            } else {
                kcal = kcal - exercise.courseB();
            }
        }
        return kcal;
    }

    public int exerciseSpecific(String type, int amount) {
        if (type.equalsIgnoreCase("treadmill")) {
            if (kcal - exercise.playTreadmill(amount) >= 1200) {
                return kcal = kcal - exercise.playTreadmill(amount);

            } else {

                return -1;
            }

        } else if (type.equalsIgnoreCase("elliptical")) {
            if (kcal - exercise.playElliptical(amount) >= 1200) {
                return kcal = kcal - exercise.playElliptical(amount);

            } else {
                return -1;

            }

        } else if (type.equalsIgnoreCase("situp")) {
            if (kcal - exercise.sitUp(amount) >= 1200) {
                return kcal = kcal - exercise.sitUp(amount);
            } else {

                return -1;
            }

        }
        return 0;
    }

    public int eatingFood(String type) {

        if (type.equalsIgnoreCase("normalFood")) {
            return this.kcal = this.kcal + 400;

        } else if (type.equalsIgnoreCase("ShabuBuffet")) {
            return this.kcal = this.kcal + 7000;
        }
        return 0;
    }

    public int guessYourWeight() {
        int OriginalWeight = kcal / 7000;

        return this.weight + OriginalWeight;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
