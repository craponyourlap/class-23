
import java.text.DateFormat;
import java.util.*;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
        System.out.println(df.format(date));
    }
}