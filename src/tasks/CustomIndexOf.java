package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class CustomIndexOf {
	public static long indexOf(File file, char character){
		return indexOf(file, character, 0);
	}
	public static long indexOf(File file, char character, long startByte){
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			long count = 0;
			int readReturn;
			while ((readReturn = fis.read()) != -1) {
				if (count >= startByte) {
					char c = (char) readReturn;
					if (c == character) {
						return count;
					}
				}
				count++;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		File file = new File("c:/Users/Vas Richard Roland/Desktop/kidolgozás.txt");
		System.out.println(indexOf(file, 'o'));
	}
}
