package tasks;

public class InsertAndArray {
	public static int[] insertTo(int [] list, int numberToInsert, int indexOfInsert){
		if (indexOfInsert > list.length || indexOfInsert < 0){
			new ArrayIndexOutOfBoundsException();
		}
		boolean inserted = false;
		int[] result = new int[list.length+1];
		for (int i = 0; i < list.length; i++) {
			if (i == indexOfInsert && !inserted) {
				result[i] = numberToInsert;
				inserted = true;
				i--;
			}
			else if (inserted){
				result[i+1] = list[i];
			}
			else {
				result[i] = list[i];
			}
		}
		return result;
	}
	public static int[] deleteTo(int[] listDelete, int numberToDelete, int indexOfDelete){
		if (indexOfDelete > listDelete.length || indexOfDelete < 0){
			new ArrayIndexOutOfBoundsException();
		}
		boolean skipped = false;
		int[] result = new int[listDelete.length - 1];
		for (int i = 0; i < result.length; i++) {
			if (indexOfDelete == i && numberToDelete == listDelete[i]) {
				i++;
				result[i-1] = listDelete[i];
				skipped = true;
			}
			else if (skipped){
				result[i-1] = listDelete[i];
			}
			else{
				result[i] = listDelete[i];
			}
		}
		if (skipped) {
			result[result.length-1] = listDelete[listDelete.length-1];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] test = new int[] {0,1,2,3,4,5,6,7,8,9};
		test = insertTo(test, 3, 4);
		test = deleteTo(test, 0, 0);
		for (int i : test) {
			System.out.println(i);
		}
	}
}
