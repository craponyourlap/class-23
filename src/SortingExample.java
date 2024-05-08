

import java.text.*;
import java.util.*;

public class SortingExample {
    public static void main(String[] args) {
        // List of fruits with accents and special characters
        List<String> fruits = Arrays.asList("pomme", "banane", "orange", "cerise", "�clair", "p�che", "citron");

        // Creating a Collator instance for the French locale
        Collator collator = Collator.getInstance(Locale.FRANCE);

        // Sorting the list of fruits using the French collation rules
        Collections.sort(fruits, collator);

        // Displaying the sorted list
        System.out.println("Fruits sorted according to French collation rules:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}