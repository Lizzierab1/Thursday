import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lizzie on 30/04/2015.
 */
public class Launcher {


    public static void main(String[] args) {
        Set<String> attendees = new HashSet<String>();
        while (true) {
            System.out.print("Who are you? ");
            String name = Input.readLine();
            if (attendees.size() == 1) {
                System.out.println("Next Thursday is May 7th. " + attendees.size() + " Person attending");
            } else {
                System.out.println("Next Thursday is May 7th. " + attendees.size() + " People attending");
            }

            System.out.print(name + ", are you coming on Thursday? ");

            String response = Input.readLine();

            if (response.equals("yes")) {
                attendees.add(name);
                System.out.println("Awesome! See you then! People now attending are: " + attendees);
            }

        }


    }

}
