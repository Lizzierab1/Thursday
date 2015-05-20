import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lizzie on 20/05/2015.
 */
public class Event {
     List<String> attendees = new ArrayList<>();


    void confirmAttendance (String name) {
        attendees.add(name);

    }

    public List<String> attendees() {
        return attendees;
    }


    public String state() {
           if (attendees.size() <3) {
               return "unconfirmed";
           } else {
               return "confirmed";
           }
    }
}
