package exercise;

import java.util.List;
import java.util.Arrays;
//import java.util.stream.Collectors;
// BEGIN
public class App {
	    public static int getCountOfFreeEmails(List<String> emails) {
		long count = 0;
		List<String> string = Arrays.asList("@gmail.com", "@yandex.ru", "@hotmail.com");
		count = emails.stream().filter(email -> email.contains(string.get(0))).count(); 
		count += emails.stream().filter(email -> email.contains(string.get(1))).count();         
		count += emails.stream().filter(email -> email.contains(string.get(2))).count();
		return (int) count;
	    }
}
// END
