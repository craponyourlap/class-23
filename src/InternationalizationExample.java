

import java.util.Locale;
import java.util.ResourceBundle;

public class InternationalizationExample {
    public static void main(String[] args) {
        // Set the desired locale
        Locale currentLocale = new Locale("en", "US"); // English locale
        
        // Load the appropriate ResourceBundle based on the locale
        ResourceBundle messages = ResourceBundle.getBundle("messages", currentLocale);

        // Get and print the greeting message
        String greeting = messages.getString("greeting");
        System.out.println("Greeting: " + greeting);
        
        // Get and print the farewell message
        String farewell = messages.getString("farewell");
        System.out.println("Farewell: " + farewell);

        // Change the locale to French
        currentLocale = new Locale("fr", "FR"); // French locale
        messages = ResourceBundle.getBundle("messages", currentLocale);
        
        // Get and print the greeting message
        greeting = messages.getString("greeting");
        System.out.println("Salutation: " + greeting);

        // Get and print the farewell message
        farewell = messages.getString("farewell");
        System.out.println("Adieu: " + farewell);
    }
}