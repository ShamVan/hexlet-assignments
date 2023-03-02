package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
	    public static LinkedHashMap genDiff(Map<String, Object> a, Map<String, Object> b) {
		            Set<String> set = new TreeSet<>();
			            Map<String, String> result = new LinkedHashMap<>();
				            for (Map.Entry<String, Object> para: a.entrySet()) {
						                set.add(para.getKey());
								        }
					            for (Map.Entry<String, Object> para: b.entrySet()) {
							                set.add(para.getKey());
									        }
						            for (String key : set) {
								                if (a.containsKey(key)&!b.containsKey(key)) {
											                result.put(key, "deleted");
													                continue;
															            }
										            if (!a.containsKey(key)&b.containsKey(key)) {
												                    result.put(key, "added");
														                    continue;
																                }
											                if (a.get(key).equals(b.get(key)))
														                result.put(key, "unchanged");
													            else result.put(key, "changed");
														            }
							            System.out.println(set);
								            LinkedHashMap<String, String> newResult = (LinkedHashMap<String, String>) result;
									            return newResult;
										        }
}
//END
