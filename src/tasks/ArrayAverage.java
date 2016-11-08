package tasks;

import java.util.Arrays;

public class ArrayAverage {
	public int[][] sixArrayRandom() {
		int[][] numbers = new int[6][6];
		int[][] result = new int[numbers.length][numbers.length];
		int amount = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				numbers[i][j] = (int) (Math.random() * 9) + 1;
				amount = amount + numbers[i][j];
				result[i][j] = numbers[i][j];
				}
		}
		System.out.println("A számok átlaga: " + (double) amount / 36);
		return result;
	}

	public static void main(String[] args) {
		ArrayAverage test = new ArrayAverage();
		int[][] result = test.sixArrayRandom();
		for (int[] i : result) {
			System.out.println(Arrays.toString(i));
		}
	}
}
