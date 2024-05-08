

import java.text.NumberFormat;
import java.util.Locale;

public class I18NTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// get info about local geographical region
		Locale locale = Locale.getDefault();
		
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getCountry());
		
		// set info about  a particular region 
		
		Locale frenchLocale = new Locale("fr", "fr");
		System.out.println(" France");
		
		
		System.out.println(frenchLocale.getDisplayCountry());
		System.out.println(frenchLocale.getDisplayLanguage());
		System.out.println(frenchLocale.getDisplayName());
		System.out.println(frenchLocale.getISO3Country());
		System.out.println(frenchLocale.getLanguage());
		System.out.println(frenchLocale.getCountry());
		
		
		
		Locale enlocale = new Locale("en","US");
		System.out.println(enlocale.getDisplayLanguage());
		
		Locale dalocale = new Locale("da","DK");
		
		System.out.println(dalocale.getDisplayCountry());
		
		NumberFormat numberFormat = NumberFormat.getInstance(dalocale);
		
		System.out.println(numberFormat.format(10088000.5555));
		
		numberFormat = NumberFormat.getCurrencyInstance(dalocale);
		System.out.println(numberFormat.format(22.3333));
		
		numberFormat = NumberFormat.getPercentInstance(dalocale);
		System.out.println(numberFormat.format(22.3333));
		
		
	
		
		
		
		

	}

}
