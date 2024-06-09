package com.io;

import java.io.*;

public class WritingTextToFile {

	public static void main(String[] args) {
		String text = "What is Java technology and why do I need it?\n" +
				"Java is a programming language and computing platform first released by Sun Microsystems in 1995.\n" +
				"There are lots of applications and websites that will not work unless you have Java installed on your\n" +
				"machine, and more are created every day.\n" +
				"Java is fast, secure, and reliable.\n" +
				"From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet,\n" +
				"Java is everywhere!";
		
		File file = new File("resources/Info.txt");
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			if(!(file.exists())) {
				file.createNewFile();
			}
			
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			pw.println(text);
			pw.flush();
			
			System.out.println("File saved...>>>>");
			
			pw.close();
			fw.close();
		} catch (IOException e) {
			System.out.println();
		}
	}

}
