package exercise;

import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// BEGIN
public class App {
	    public static String getForwardedVariables(String conf) {
		StringBuilder R = new StringBuilder();
		        List<String> words = List.of(conf.split(" "));
			        words.stream()
					                .filter(word -> word.contains("X_FORWARDED_"))
							                .flatMap(word -> Stream.of(word.substring(word.indexOf("\"") + 1, word.length()-1).split(",")))
									                .filter(word -> word.contains("X_FORWARDED_"))
											                .filter(word -> word.substring(17, word.length()).length() > 1)
													                .forEach(word -> R.append(word.substring(12, word.length())).append(","));
	return R.substring(0, R.length()-1).toString();
								        }
}
//END
