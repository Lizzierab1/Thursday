import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Lizzie on 30/04/2015.
 */
public class Input {
    public static String readLine() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
