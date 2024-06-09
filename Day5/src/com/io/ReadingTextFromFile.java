package com.io;

import java.io.*;

public class ReadingTextFromFile {

	public static void main(String[] args) {
		String text = null;
		
		File file = new File("resources/myCV.txt");
		
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			text = br.readLine();
			while(text!=null) {
				System.out.println(text);
				text = br.readLine();
			}
			br.close();
			fileReader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
