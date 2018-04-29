package smartphone;

import java.util.Objects;

public class Application extends Item {

    private String icon;
    private String name;

    public Application(String icon, String name) {
        super(name);
        this.icon = icon;
    }

    //ได้จากการ insert
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.icon);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Application other = (Application) obj;
        if (!Objects.equals(this.icon, other.icon)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Application: " + this.getName();
    }

}
