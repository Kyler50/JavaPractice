public class SortedSquareArrayGenerator{




	int[] arr;
	
	public SortedSquareArrayGenerator(int[] a){
		arr = a;
	}
	
	
	
	public int[] generate(){
		int[] result = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			result[i] = arr[i] * arr[i];
		}
		
		boolean wasSwap = true;
		while(wasSwap){
			wasSwap = false;
			for(int i = 0; i < result.length - 1; i++){
				if(result[i] > result[i + 1]){
					int temp = result[i];
					result[i] = result[i + 1];
					result[i + 1] = temp;
					wasSwap = true;
				}
			}
		}
		return result;
		
	}
	
	
	
	
	public static void main(String[] args){
		int[] numbers = {3, 7, 4};
		SortedSquareArrayGenerator test = new SortedSquareArrayGenerator(numbers);
		int[] result = test.generate();
		for(int i : result){
			System.out.println(i);
		}
	}
}