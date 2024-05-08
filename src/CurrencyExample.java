
import java.text.*;
import java.util.*;

public class CurrencyExample {
    public static void main(String[] args) {
        double amount = 1234.56;
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(currencyFormat.format(amount));
    }
}