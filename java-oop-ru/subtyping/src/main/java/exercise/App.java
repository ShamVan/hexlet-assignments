package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
public class App {
	public static void swapKeyValue(KeyValueStorage store) {
		Set<String> Item = store.toMap().keySet();
		Map<String, String> map = store.toMap();
		
		for (String item : Item) {
			store.unset(item);
		}
		
		for (String item : Item) {
			store.set(map.get(item), item);
	        }	
	}
}
// END
