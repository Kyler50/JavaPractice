package tasks;

public class StringSwitch {
	public static final char[] FIRSTCHARS = {'a', 'c', 'e'};
	public static final char[] SECONDCHARS = {'b', 'd', 'f'};
	
	
	public static String changer(String input){
		StringBuilder returns = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char actual = input.charAt(i);
			for (int j = 0; j < FIRSTCHARS.length; j++) {
				if (input.charAt(i) == FIRSTCHARS[j]){
						actual = SECONDCHARS[j];
					}
				}
				returns.append(actual);
			}
		return returns.toString();
	}
	public static void main(String[] args) {
		System.out.println(changer("ez már döfe."));
	}
}
