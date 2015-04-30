/**
 * Created by Lizzie on 30/04/2015.
 */
public class Launcher {


    public static void main(String[] args) {
        while (true) {
            System.out.println("Next Thursday is May 7th. 0 People attending");

            System.out.print("Are you coming on Thursday? ");

            String response = Input.readLine();

            if (response.equals("yes")) {
                System.out.println("Awesome! See you then!");
            }

        }


    }

}
