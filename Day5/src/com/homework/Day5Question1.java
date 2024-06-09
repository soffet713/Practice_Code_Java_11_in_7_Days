package com.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Day5Question1 {

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		
		File file = new File("resources/names.txt");
		
		FileReader fileReader = null;
		BufferedReader br = null;
		String currName = null;
		
		try {
			 fileReader = new FileReader(file);
			 br = new BufferedReader(fileReader);
			 currName = br.readLine();
			 while(currName!=null) {
				 System.out.println(currName);
				 nameList.add(currName);
				 currName = br.readLine();
			 }
			 br.close();
			 fileReader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n******* Swapping First and Last Names *******\n");
		
		nameList = swapNames(nameList);
		
		System.out.println("\n******* Sorting Names and Creating New File *******\n");
		
		Collections.sort(nameList);
		
		System.out.println("\n******* Swapping Names back and Creating New File *******\n");
		
		nameList = swapNames(nameList);
		
		File newFile = new File("resources/assortedNames.txt");
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			if(!(newFile.exists())) {
				newFile.createNewFile();
			}
			
			fw = new FileWriter(newFile);
			pw = new PrintWriter(fw);
			
			for(int x=0; x<nameList.size(); x++) {
				currName = nameList.get(x);
				pw.println(currName);
			}
			
			pw.flush();
			
			System.out.println("File saved...>>>>");
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println();
		}
	}
	
	public static ArrayList<String> swapNames(ArrayList<String> names) {
		String firstName = null;
		String surname = null;
		String newName = null;
		ArrayList<String> reversedNames = new ArrayList<String>();
		
		for(String name:names) {
			firstName = name.substring(0, name.indexOf(" "));
			surname = name.substring(name.indexOf(" ")+1, name.length());
			newName = surname + " " + firstName;
			reversedNames.add(newName);
			//System.out.println(newName);
		}
		
		return reversedNames;
	}

}
