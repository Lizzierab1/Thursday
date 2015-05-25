import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by Lizzie on 20/05/2015.
 */
public class EventTest {
    @Test
    public void when_user_confirms_attendance_they_are_attending() {
        Event event = new Event(Arrays.asList("Asia","Rabs","Justin"));

        event.confirmAttendance("Asia");

        assertEquals(Arrays.asList("Asia"), event.attendees());
        assertEquals("unconfirmed", event.state());
    }

    @Test
    public void when_several_users_confirm_attendance_they_are_all_attending() {
        Event event = new Event(Arrays.asList("Asia","Rabs","Justin"));

        event.confirmAttendance("Asia");
        event.confirmAttendance("Rabs");

        assertEquals(Arrays.asList("Asia", "Rabs"), event.attendees());
        assertEquals("unconfirmed", event.state());
    }


    @Test
    public void when_all_users_confirm_attendance_event_is_confirmed() {
        Event event = new Event(Arrays.asList("Asia","Rabs","Justin"));

        event.confirmAttendance("Asia");
        event.confirmAttendance("Rabs");
        event.confirmAttendance("Justin");
        assertEquals("confirmed", event.state());
    }


    @Test public void when_all_but_one_have_confirmed_event_is_unconfirmed() {
        Event event = new Event(Arrays.asList("Asia","Rabs","Justin", "4th person"));

        event.confirmAttendance("Asia");
        event.confirmAttendance("Rabs");
        event.confirmAttendance("Justin");
        assertEquals("unconfirmed", event.state());
    }

    @Test public void when_someone_uninvited_attempts_to_confirm_they_arent_counted_as_attending() {
        Event event = new Event(Arrays.asList("Asia","Rabs","Justin"));

        event.confirmAttendance("Steve");
        event.confirmAttendance("Asia");

        assertEquals(Arrays.asList("Asia"), event.attendees());
    }
}

