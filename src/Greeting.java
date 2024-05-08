
import java.util.Locale;
import java.util.ResourceBundle;
public class Greeting {
    private static ResourceBundle messages = ResourceBundle.getBundle("Messages_fr");

    public static void main(String[] args) {
        System.out.println(messages.getString("greeting"));
    }
}