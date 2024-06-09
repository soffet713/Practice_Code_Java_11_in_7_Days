package com.Homework1;

public class Homework_1 {

	public static void main(String[] args) {
		String[] menuOptions = new String[] {"Games","Home Video Collection","Flight Plans","Work Documents","Exit"};
		int numOption = 1;
		for(String option:menuOptions) {
			System.out.println(numOption + ". " + option);
			numOption++;
		}
		
		System.out.println();
		numOption=1;
		String[] framedOptions = new String[] {"+------------------------------+","|    1. Games                  |","|    2. Home Video Collection  |","|    3. Flight Plans           |",
				"|    4. Work Documents         |","|    5. Exit                   |","+------------------------------+"};
		for(String framedOption:framedOptions) {
			System.out.println(framedOption);
			numOption++;
		}
	}

}
