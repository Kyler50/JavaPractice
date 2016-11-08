package tasks;

public class OrderedBy {
	public static int[] organize(int[] numbers){
		int[] distinct = noDuplication(numbers);
		int[] sorted  = sortAscendingly(distinct);
		int [] evenNumbers = getEvenNumbers(sorted);
		int[] oddNumbers = getOddNumbers(evenNumbers);
		int[] result = merge(evenNumbers, oddNumbers);
		return result;
	}
		
		
	public static int[] merge(int[] evenNumbers, int[] oddNumbers){
			int[] result = new int[evenNumbers.length + oddNumbers.length];
			int evenIndex = 0;
			int oddIndex = 0;
			for (int i = 0; i < result.length; i++) {
				if (i % 2 != 0 && oddIndex < oddNumbers.length) {
					result[i] = oddNumbers[oddIndex];
					oddIndex++;
				}
				else if(i % 2 == 0 && evenIndex < evenNumbers.length){
					result[i] = evenNumbers[evenIndex];
					evenIndex++;
				}
			}
			return result;
		}
	public static int[] noDuplication(int[] numbers){ 
		for (int i = 0; i < numbers.length; i++){
			for (int j = i+1; j < numbers.length; j++){
				if ((numbers[i]^numbers[j]) == 0){
					numbers[j] = 0;
				}
			}
		}
		return numbers;
	}
	public static int[] sortAscendingly(int[] numbers){
		int[] result = new int[numbers.
		                       length];
		boolean wasSwap = true;
		while(wasSwap)
        {
            wasSwap = false;
            for (int i = 0; i < numbers.length - 1; i++)
            {
                if (numbers[i] > numbers[i + 1])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    wasSwap = true;
                }
            }
        }
		return result;
		
	}
	public static int[] getEvenNumbers(int[] numbers){
		int[] result;
		int count = 0;
		for (int i : numbers) {
			if (i % 2 == 0) {
				count++;
			}
		}
		result = new int[count];
		int numberIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				result[numberIndex] = numbers[i];
				numberIndex++;
			}
		}
		return result;
	}
	public static int[] getOddNumbers(int[] numbers){
		int[] result;
		int count = 0;
		for (int i : numbers) {
			if (i % 2 == 1) {
				count++;
			}
		}
		result = new int[count];
		int numberIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {
				result[numberIndex] = numbers[i];
				numberIndex++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] input = {9,7,5,3,1,6,9,4};
		int[] result = organize(input);
		for (int i : result) {
			System.out.print(i + "  ");
		}
	}
}
