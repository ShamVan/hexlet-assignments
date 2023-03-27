package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
public class InMemoryKV implements KeyValueStorage {
	
	Map<String, String> storage = new HashMap<>();
	
	public InMemoryKV(Map<String, String> map) {
		this.storage = map;
	}

	public void set(String key, String value) {
		this.storage.put(key, value);		
	}
	public void unset(String key) {
		this.storage.remove(key);
	}
	public String get(String key, String defaultValue) {
		if (!this.storage.containsKey(key)) return defaultValue;
		else return this.storage.get(key);	
	}
	public Map toMap() {
		return storage;
	}
}
// END
