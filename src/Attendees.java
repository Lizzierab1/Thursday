import java.util.HashSet;
import java.util.Set;

/**
 * Created by Asia on 30/04/2015.
 */
public class Attendees {
    Set<String> values = new HashSet<String>();

    public void add(String name) {
        values.add(name);
    }

    public void remove(String name) {
        values.remove(name);
    }

    public int quantity() {
        return values.size();
    }

    public String all() {
        return values.toString();
    }
}
