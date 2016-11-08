package tasks;



public class StringSplitterNumber {
	public static String[] splitByNumber(String s, int size){
		int inLength = s.length();
        int arLength = inLength / size;
        int left = inLength % size;
        if(left > 0){++arLength;}
        String ar[] = new String[arLength];
            String tempText = s;
            for (int i = 0; i < arLength; ++i) {
                if(tempText.length() > size){
                ar[i]=tempText.substring(0, size);
                tempText=tempText.substring(size);
                }else{
                    ar[i]=tempText;
                }

            }


        return ar;
	}
	public static void main(String[] args) {
		String [] ar = splitByNumber("wgjötrj trmhit m "
				+ "hirmie mr eimböi ermh!", 8);
		for (String string : ar) {
			System.out.println(string);
		}
	}
}
