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
