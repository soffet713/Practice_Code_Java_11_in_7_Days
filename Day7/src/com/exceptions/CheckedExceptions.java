package com.exceptions;

import java.io.*;

public class CheckedExceptions {

	public static void main(String[] args) {
		File file;
		FileReader fr;
		BufferedReader br;
		
		String companyName = null;
		
		try {
			file = new File("resources/companies.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			companyName = br.readLine();
			
			while(companyName!=null) {
				System.out.println("Company name: " + companyName);
				companyName = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
