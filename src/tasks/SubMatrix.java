package tasks;

import java.util.ArrayList;
import java.util.List;

public class SubMatrix {
	static int numbers[][] = {{2, 7, 3, 8, 18, 76, 24}, 
							  {5, 25, 13, 96, 23, 56, 12, 85},
							  {56, 81, 2, 4, 99, 21}};
	static final int[][] DIRECTIONS = new int[][]{
		{-1,-1},{-1,0},{-1,1},
		{0,-1},{0,1},
		{1,-1},{1,0},{1,1},
	};
	public List<Integer> subMatrix(int[][] numbers, int x, int y, int range){
		 List<Integer> result = new ArrayList<Integer>();
		    for (int[] dir : DIRECTIONS) {
		        int dx = x + dir[0];
		        int dy = y + dir[1];
		        if(dy >=0 && dy < numbers.length)
		            if(dx >= 0 && dx < numbers[dy].length)
		            	if (range <= 1)
		                result.add(numbers[dy][dx]);
		            	else {
		            			result.add(numbers[dy][dx]* range);
							}
		    }
			return result;
	}
	public static void main(String[] args) {
		SubMatrix test = new SubMatrix();
		System.out.println(test.subMatrix(numbers, 0, 0, 2));
	}
}
