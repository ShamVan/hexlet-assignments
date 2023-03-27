package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
	public static void swapKeyValue(KeyValueStorage store) {
		Map<String, String> Item = store.toMap();
		Map<String, String> Result = store.toMap();
		Result.clear();
		for (Map.Entry<String, String> item : Item.entrySet()) {
			Result.put(item.getValue(), item.getKey());
		}
		store = (KeyValueStorage) Result;	
	}
}
// END
