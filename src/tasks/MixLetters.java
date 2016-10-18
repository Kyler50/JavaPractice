package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MixLetters {
	public static String stringFormatter(String string){
		String[] words = string.split(" ");
		StringBuilder builder = new StringBuilder();
		for (String word : words) {
			List<Character> letters = new ArrayList<>();
			for (char letter : word.toCharArray()) {
				letters.add(letter);
			}
			if (letters.size() > 2) {
				Collections.shuffle(letters.subList(1, letters.size()- 1));
			}
			for (char letter : letters) {
				builder.append(letter);
			}
			builder.append(" ");
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(stringFormatter("Egy éve a legelsõ Riot pls alkalmával sikerült azonnal lábon lõni magunkat, amikor arról írtunk, hogy min dolgozunk éppen, és min nem. Akkoriban azt írtuk, hogy nem tervezzük egy gyakorlómód bevezetését, ahol egyedül, korlátozások nélkül lehet gyakorolni. Nagy volt a felhördülés, mi pedig értettük a finom célzást."));
		
		
	}
}
