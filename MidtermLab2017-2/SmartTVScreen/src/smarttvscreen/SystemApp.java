<<<<<<< HEAD
package smarttvscreen;

public class SystemApp extends Application{

    private String type;

    public SystemApp(String name, String type) {
        super(name);
        this.type = type;
    }

    public SystemApp(String name, String description, String type) {
        super(name,description);
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getName() + "\n - SystemApp " + "type: " + type + "\n" + this.getDescription();
    }
}
=======
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
>>>>>>> d55087d320aade705a735a719d7db7e95b19bf96
