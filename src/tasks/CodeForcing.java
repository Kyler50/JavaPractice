package tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CodeForcing
{
	private static final char[] CHARSET = {1, 2, 3, 'a', 'b', 'c'};
	
	public static void variations(List<Character> charList, int k){
		for (char c : CHARSET)
		{
			charList.add(c);
		}
		for (int i = k; i < charList.size(); i++)
		{
			Collections.swap(charList, i, k);
			variations(charList, k + 1);
			Collections.swap(charList, k, i);
		}
		if (k == charList.size() - 1)
		{
			System.out.println(Arrays.toString(charList.toArray()));
		}
	}
	public static void main(String[] args)
	{
		
	}
}
