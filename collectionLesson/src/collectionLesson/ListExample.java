package collectionLesson;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String> vowels = new ArrayList<String>();
		vowels.add("a");
		vowels.add("o");
		vowels.add(1, "e");
		
		System.out.println(vowels);

	}

}
