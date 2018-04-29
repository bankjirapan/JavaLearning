<<<<<<< HEAD
package smarttvscreen;

public class InstalledApp extends Application{

    private String company;

    public InstalledApp(String name, String company) {
        super(name);
        this.company = company;
    }

    public InstalledApp(String name, String description, String company) {
        super(name,description);
        this.company = company;
    }

    @Override
    public String toString() {
        return this.getName() + "\n- Installed App " + " company:  " + company + "\n" + this.getDescription();
    }

}
=======
package smarttvscreen;

public class InstalledApp{

    private String company;

    public InstalledApp(String name, String company) {

        this.company = company;
    }

    public InstalledApp(String name, String description, String company) {

        this.company = company;
    }

    @Override
    public String toString() {
        return this.getName() + "\n- Installed App " + " company:  " + company + "\n" + this.getDescription();
    }

}
>>>>>>> d55087d320aade705a735a719d7db7e95b19bf96
