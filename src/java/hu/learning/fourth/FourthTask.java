package hu.learning.fourth;

import hu.learning.ITask;
import hu.learning.fourth.Author;

public class FourthTask implements ITask{
	
	//Ez a program lesz a konyvesbolt nyilvantarto program.
	
	@Override
	public boolean checkExcercise() {
		//Ezt most a programunk fo belepesi pontjanak fogjuk tekinteni
		System.out.println("Welcome to library! What would you like to do?");
		System.out.println("1: Crate a new Author? ");
		System.out.println("2: Crate a new Book? ");
		System.out.println("3: Sorting Authors? ");
		System.out.println("4: Sorting books? ");
		System.out.println("5: Quit! ");
		
		while (System.console().readLine() != "5") {
			switch (System.console().readLine()) {
			case "1": 
				
			}
			
		}
		
		return false;
	}

}
