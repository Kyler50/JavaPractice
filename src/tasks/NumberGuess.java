package tasks;

import java.util.Scanner;

public class NumberGuess {
	int generatedNumber = (int) (Math.random() * 99);
	Scanner keyboard = new Scanner(System.in);
	int guess;
	int count = 0;
	public void NumGuess(){
		System.out.println("1 �s 100 k�z�tti sz�mra gondoltam...kital�lod?");
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
				System.out.println("Gratul�lok,ki�rdemelt�l egy buksi simit, a sz�m: " + generatedNumber + " volt. Pr�b�lkoz�said sz�ma: " + newcount);
			}
		}
	}
	public static void main(String[] args) {
		NumberGuess test = new NumberGuess();
		test.NumGuess();
		
		
	}
}
