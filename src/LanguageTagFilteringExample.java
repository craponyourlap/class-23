

import java.util.Locale;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
public class LanguageTagFilteringExample {
   public static void main(String[] args) {
     String ranges = "en-US;q=1.0,en-GB;q=0.5,de-DE;q=0.0";
     List<Locale.LanguageRange> languageRanges = Locale.LanguageRange.parse(ranges);
     Collection<Locale> localesList = new ArrayList<>();
     localesList.add(Locale.forLanguageTag("en-GB"));
     localesList.add(Locale.forLanguageTag("en-US"));
     localesList.add(Locale.forLanguageTag("ja-*"));
     localesList.add(Locale.forLanguageTag("en-US"));
     localesList.add(Locale.forLanguageTag("de-DE"));
     List<Locale> filteredSet = Locale.filter(languageRanges,localesList);
     for(Locale locale : filteredSet){
       System.out.println(locale.toString());
     }
   }
}