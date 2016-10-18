package tasks;

public class StringTree {
	public static void main(String[] args) {
		char[] words = "Boldog Karácsonyt!".toCharArray();
		  for (int i = 0; i < words.length; i++) {
		   for (int j = 0; j < words.length - i; j++)
		    System.out.print(" ");
		   for (int k = 0; k < (2 * i + 1); k++)
		    System.out.print(words[i]);
		   System.out.println();
		  }
	}
}

