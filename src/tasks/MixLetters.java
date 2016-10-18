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
		System.out.println(stringFormatter("Egy �ve a legels� Riot pls alkalm�val siker�lt azonnal l�bon l�ni magunkat, amikor arr�l �rtunk, hogy min dolgozunk �ppen, �s min nem. Akkoriban azt �rtuk, hogy nem tervezz�k egy gyakorl�m�d bevezet�s�t, ahol egyed�l, korl�toz�sok n�lk�l lehet gyakorolni. Nagy volt a felh�rd�l�s, mi pedig �rtett�k a finom c�lz�st."));
		
		
	}
}
