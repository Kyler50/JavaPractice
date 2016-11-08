package tasks;


public class BubbleSortedString {
	public static int[] sortedFaszom(int [] numbers){
		boolean isSwap = true;
		String[] valami=new String[numbers.length];
		for (int i =0;i<numbers.length;i++) {
			valami[i]=String.valueOf(numbers);
		}
		System.out.println(valami[0]);
		/*while (isSwap) {
			isSwap=false;
			for(int i = 0; i < valami.length() - 1; i++){
				if(valami.charAt(i) < valami.charAt(i + 1)){
					int b = valami.charAt(i + 1);
					int a = valami.charAt(i);
					int temp = a;
					a = b;
					b = temp; 
					isSwap = true;
					
				}
			}
		}*/
		return numbers;
	}
	public static void main(String[] args) {
		int [] numbers = {1, 2, 5, 4, 9, 6};
		int [] result = BubbleSortedString.sortedFaszom(numbers);
		for (int i : result) {
			System.out.println(i);
		}
	}
}
