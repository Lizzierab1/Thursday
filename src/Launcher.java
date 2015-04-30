/**
 * Created by Lizzie on 30/04/2015.
 */
public class Launcher {


    public static void main(String[] args) {
        int attendees = 0;
        while (true) {
            System.out.println("Next Thursday is May 7th. " + attendees + " People attending");

            System.out.print("Are you coming on Thursday? ");

            String response = Input.readLine();

            if (response.equals("yes")) {
                attendees = attendees + 1;
                System.out.println("Awesome! See you then!");
            }

        }


    }

}
