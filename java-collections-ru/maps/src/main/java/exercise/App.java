package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

// BEGIN
public class App {
	    public static Map<String, Integer> getWordCount(String sentence) {
		            Map<String, Integer> Result = new HashMap<>();
			            if (sentence.isEmpty()) {
					                return Result;
							        }
				            List<String> words = List.of(sentence.split(" "));
					            for (String word : words) {
							                Integer sum = 1;
									            for (int i=words.indexOf(word) + 1; i < words.size(); i++) {
											                    if (words.get(i).equals(word)) {
														                        sum++;
																	                }
													                }
										                Result.put(word, sum);
												        }
						            
							            return Result;
								        }

	        public static String toString(Map<String, Integer> spisok) {
			        if (spisok.isEmpty()) {
					            return "{}";
						            }
				        StringBuilder result = new StringBuilder();
					        result.append("{\n");
						        if (!spisok.isEmpty()) {
								            for (Map.Entry<String, Integer> abc : spisok.entrySet()) {
										                    result.append("  ").append(abc.getKey()).append(": " + abc.getValue() + "\n");
												                }
									            }
							        result.append("}");
																        return result.toString();
										    }
}
//END
