package tasks;

public class UnLuckyNumber {
	public static boolean isThisNumber13(int number){
		String inputString = String.valueOf(number);
		boolean result = false;
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = 0; j < inputString.length(); j++) {
				if(inputString.charAt(i) == '1' && inputString.charAt(j) == '3' && i < j)
				result = true;
			}
		}if(result == true){
			System.out.println("Hmm benne van a 13-as, vigyázz az utcán!");
		}
		return result;
	}
	public static void main(String [] args){
		UnLuckyNumber.isThisNumber13(1331);
		}
}
