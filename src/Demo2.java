import java.text.NumberFormat;
import java.util.Locale;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale usLocale = Locale.forLanguageTag("en-US");
		Locale deLocale = Locale.forLanguageTag("de-Germany");
		long number = 123456789L;
		NumberFormat denf = NumberFormat.getInstance(deLocale);
		NumberFormat usnf = NumberFormat.getInstance(usLocale);
		System.out.println(denf.format(number));
		System.out.println(usnf.format(number));
	}

}
