package tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2){
		Set<String> result = new HashSet<>();
		for (String a1 : array1){
			for (String a2 : array2){
				if (a2.contains(a1)){
					result.add(a1);
				}
			}
		}
		 String[] resultArray = result.toArray(new String[result.size()]);

		Arrays.sort(resultArray);
		return resultArray;
	}
	public static void main(String[] args) {
		String [] ar1 = {"arp", "live", "strong"};
		String [] ar2 = {"lively", "alive", "anyad", "fukyou", "armstrong"};
		String [] returns = WhichAreIn.inArray(ar1, ar2);
		for (String string : returns) {
			System.out.println(string);
		}
	}
}
