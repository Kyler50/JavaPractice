package tasks;

import java.util.Scanner;

public class NumberGuess {
	int generatedNumber = (int) (Math.random() * 99);
	Scanner keyboard = new Scanner(System.in);
	int guess;
	int count = 0;
	public void NumGuess(){
		System.out.println("1 és 100 közötti számra gondoltam...kitalálod?");
		while (guess != generatedNumber){
			guess = keyboard.nextInt();
			if (guess > generatedNumber) {
				System.out.println("Kisebb");
				count++;
				}
			else if (guess < generatedNumber){
				System.out.println("Nagyobb");
				count++;
			}
			else {
				int newcount = count + 1;
				System.out.println("Gratulálok,kiérdemeltél egy buksi simit, a szám: " + generatedNumber + " volt. Próbálkozásaid száma: " + newcount);
			}
		}
	}
	public static void main(String[] args) {
		NumberGuess test = new NumberGuess();
		test.NumGuess();
		
		
	}
}
