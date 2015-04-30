import java.util.HashSet;
import java.util.Set;

/**
 * Created by Lizzie on 30/04/2015.
 */
public class Launcher {


    public static void main(String[] args) {
        Attendees attendees = new Attendees();
        while (true) {
            System.out.print("Who are you? ");
            String name = Input.readLine();
            if (attendees.quantity() == 1) {
                System.out.println("Next Thursday is May 7th. " + attendees.quantity() + " Person attending");
            } else {
                System.out.println("Next Thursday is May 7th. " + attendees.quantity() + " People attending");
            }

            System.out.print(name + ", are you coming on Thursday? ");

            String response = Input.readLine();

            if (response.equals("yes")) {
                attendees.add(name);
                System.out.println("Awesome! See you then! People now attending are: " + attendees.all());
            } else if (response.equals("no")){
                attendees.remove(name);
                System.out.println("That's a shame, you fail. People now attending are: " + attendees.all());
            }

        }


    }

}
