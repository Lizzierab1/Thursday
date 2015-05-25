import java.util.ArrayList;
import java.util.List;

/*
 * Created by Lizzie on 20/05/2015.
 */
class Event {
     List<String> attendees = new ArrayList<>();
    List<String> invitees;

    Event(List<String> invitees) {

        this.invitees = invitees;
    }


    void confirmAttendance (String name) {
        if (invitees.contains(name)){
            attendees.add(name);
        }


    }

    List<String> attendees() {
        return attendees;
    }


    String state() {
           if (attendees.size() < invitees.size()) {
               return "unconfirmed";
           } else {
               return "confirmed";
           }
    }
}
