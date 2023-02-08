package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
	int n = 2;
	List<Integer> count = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
	List<Integer> actual1 = App.take(count, n);
	assertThat(actual1).isEqualTo(Arrays.asList(1, 2));	
        // END
    }
}
