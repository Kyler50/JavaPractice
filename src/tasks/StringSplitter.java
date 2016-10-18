package tasks;

import java.util.ArrayList;
import java.util.List;

public class StringSplitter {
	public static String[] cutter(String str, int length){
		String [] splitted = str.split(" ");
		List<String> words = new ArrayList<>();
		String row = "";
		for (String string : splitted) {
			if (row.length() + string.length() > length){
				words.add(row.trim());
				row = "";
			}
			row += string + " ";
		}
		words.add(row);
		return (String[])words.toArray(new String[words.size()]);
	}
	public static void main(String[] args) {
		String[] splitter = StringSplitter.cutter("I am a Codecooler bitches!", 6);
		for (String string : splitter) {
			System.out.println(string);
		}
	}
}
