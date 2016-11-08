package tasks;

public class Coins {
	 public static int[] split(int input){
	        int[] result = new int[4];
	        result[0] = input / 10;
	        input = input - result[0]*10;
	        result[1] = input / 5;
	        input = input - result[1]*5;
	        result[2] = input / 2;
	        input = input - result[2]*2;
	        result[3] = input;
	        
	        return result;
	    }
	    
	    public static void main(String arg[]){
	    	int number = 148;
	        int[] input = split(number);
	        for (int i : input){
	        
	        System.out.println(i);
	        }
	    }
}
