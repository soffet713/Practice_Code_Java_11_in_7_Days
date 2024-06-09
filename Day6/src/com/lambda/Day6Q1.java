package com.lambda;

import java.io.*;
import java.util.ArrayList;

public class Day6Q1 {

	public static void main(String[] args) {
		ArrayList<String> companyList = new ArrayList<String>();
		String currCompany = null;
		
		File file = new File("resources/companies.txt");
		
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try {
			fileReader = new FileReader(file);
			br = new BufferedReader(fileReader);
			currCompany = br.readLine();
			while(currCompany!=null) {
				companyList.add(currCompany);
				currCompany = br.readLine();
			}
			br.close();
			fileReader.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		companyList.stream().forEach(company -> System.out.println(company));
		
		System.out.println("\n======= Only Companies That Begin with A =======");
		companyList.stream().filter(company -> company.charAt(0) == 'A').forEach(company -> System.out.println(company));
	}

}
