package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
	    public static List<Map<String, String>> findWhere(List<Map<String, String>> spisok, Map<String, String> findBook) {
		            List<Map<String, String>> Result = new ArrayList<>();
			            for (Map<String, String> book : spisok) {
					                int sum = 0;
							            for (Map.Entry<String, String> prop : book.entrySet()) {
									                    for (Map.Entry<String, String> findProp : findBook.entrySet()) {
												                        if (prop.getKey().equals(findProp.getKey()) & prop.getValue().equals(findProp.getValue())) {
																                        sum++;
																			                    }
															                }
											                }
								                if (sum == findBook.size()) {
											                Result.add(book);
													            }
										        }
				            return Result;
					        }
}
//END
