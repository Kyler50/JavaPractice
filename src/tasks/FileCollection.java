package tasks;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileCollection {
	
	
	public static Map<Long, Set<File>> fileSize(File folder){
		Map<Long, Set<File>> result = new HashMap<>();
		File[] listOfFiles = folder.listFiles();
		Set <File> setList = new HashSet<>();
		for (int i = 0; i < listOfFiles.length - 1 ; i++) {
			if(listOfFiles[i].isFile()){
				for (int j = i+1; j < listOfFiles.length; j++) {	
					if(listOfFiles[j].isFile() && listOfFiles[i].length() == listOfFiles[j].length()){
						setList.add(listOfFiles[i]);
						setList.add(listOfFiles[j]);
						System.out.println(setList);
					}
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		File folder = new File("C:\\workspace");
		Map<Long, Set<File>> result = fileSize(folder);
		for (Long s : result.keySet()) {
			Set<File> value = result.get(s);
			for (File file : value) {
				System.out.print(file.getAbsolutePath() + " ");
			}
		}
	}
}
