package tasks;

import java.util.Arrays;


public class NoDuplicatedNumbers {
	public int[] NoDuplicated(int [] number){
		int arrayLen = number.length;
        for(int i=0;i<arrayLen;i++){
            for(int j = i+1; j< arrayLen ; j++){
                if(((number[i]^number[j]) == 0)){
                	number[j] = 8;
                }
                    
            }
        }       
        return number;       
	}
	public static void main(String[] args) 
	{
	    int[] numbers = new int[5000];       
	    for(int i = 0; i < numbers.length; i++) {
	      numbers[i] = (int)(Math.random()*10);
	    }
	    System.out.println("Numbers Generated: " + Arrays.toString(numbers));
	    NoDuplicatedNumbers test = new NoDuplicatedNumbers();
	    test.NoDuplicated(numbers);
	    System.out.println("The final Numbers: " + Arrays.toString(numbers));
	    
	}
}

