package smarttvscreen;

public class SystemApp {

    private String type;

    public SystemApp(String name, String type) {

        this.type = type;
    }

    public SystemApp(String name, String description, String type) {

        this.type = type;
    }

    @Override
    public String toString() {
        return this.getName() + "\n - SystemApp " + "type: " + type + "\n" + this.getDescription();
    }
}
