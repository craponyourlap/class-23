import java.text.NumberFormat;
import java.util.Locale;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale deLocale = Locale.GERMANY;
		Locale usLocale = Locale.US;
		long number = 123456789L;
		NumberFormat denf = NumberFormat.getInstance(deLocale);
		NumberFormat usnf = NumberFormat.getInstance(usLocale);
		System.out.println(denf.format(number));
		System.out.println(usnf.format(number));
	}

}
