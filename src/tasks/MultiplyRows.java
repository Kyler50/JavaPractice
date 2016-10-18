package tasks;

import java.util.Arrays;

public class MultiplyRows {
	int[][] field = new int[][] { { 1, 4, 6, 7, 5, 10 }, 
		{ 2, 3, 9 }, 
		{ 10 }, 
		{ 12, 20, 41, 34 }, 
		{ 8, 15, 17 }, };
	
	public int[][] multRow(){
		for (int i = 0; i < field.length; i++) {
			if (i % 2 == 1){
				for (int j = 0; j < field[i].length; j++) {
					int row = field[i][j] * -1;
					field[i][j] = row;
				}
			}
		}
		rowMult();
		return field;
	}
	public int[][] rowMult(){
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j+=2) {
				int row = field[i][j]* -1;
				 field[i][j] = row;
			}
		}
		return field;
	}
	public static void main(String[] args) {
	    MultiplyRows mr = new MultiplyRows();
	    int[][] result = mr.multRow();
	    for (int[] i : result) {
	        System.out.println(Arrays.toString(i));
	    }
	}
}
