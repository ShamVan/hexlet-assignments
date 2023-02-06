package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
	public static boolean scrabble(String letters, String word) {
		if (letters == "")
	            return false;
	        if (letters.length() < word.length())
	            return false;
	        letters = letters.toLowerCase();
	        word = word.toLowerCase();
	        List<String> listLetters = new ArrayList<>();
	        List<String> listWord = new ArrayList<>();
	        for (int i = 0; i < word.length(); i++) {
	            listWord.add(word.substring(i, i+1));
	        }
	        for (int i = 0; i < letters.length(); i++) {
	            listLetters.add(letters.substring(i, i+1));
                if (listWord.isEmpty())
                	return true;
	            else if (listWord.contains(listLetters.get(i)))
	                    listWord.remove(listLetters.get(i));
                }
	        return listWord.isEmpty();
    }
}
//END
