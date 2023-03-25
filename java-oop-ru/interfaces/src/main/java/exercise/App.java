package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

// BEGIN
public class App {
	public static List buildApartmentsList(List<Home> home, int n) {
		/*List<Home> bufer = new ArrayList<>(1);
		for (int i = 0; i < home.size() - 1; i++) {
			for (int j = 1; j < home.size(); j++) {
				if (home.get(i).compareTo(home.get(j)) == 1) {
					bufer.add(0, home.get(i));
					home.add(i, home.get(j));
					home.add(j, bufer.get(0));
				}
			}
		}
		return home.subList(0, n);*/
		return home.stream()
			.sorted(Home::compareTo)
			.limit(n)
			.map(Home::toString)
			.collect(Collectors.toList());
	}
}
// END
