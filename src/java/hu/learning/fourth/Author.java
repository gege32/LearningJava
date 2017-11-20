package hu.learning.fourth;

import java.util.Scanner;

public class Author {
	
	public enum Gender {
		MALE, FEMALE;
	}


	private String name, age; 
	
	private Gender gender;
	
	public Author(String name, String age, Gender gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public Author(){}
	
	private void askName(Scanner reader) {
		System.out.println("Please give the name of the Author:");
		name = reader.nextLine();
				
	}
	private void askAge(Scanner reader) {
		System.out.println("Please give the age of the Author:");
		age = reader.nextLine();
		
	}
	private void askGender(Scanner reader) {
		System.out.println("Please give the gender of the Author: (1: male, 2: female)");
		String gender = reader.nextLine();
		if(gender.equals("1")){
			this.gender = Gender.MALE;
		}else{
			this.gender = Gender.FEMALE;
		}
		
	}
	
	public void crateAuthor(Scanner reader) {
		askName(reader);
		askAge(reader);
		askGender(reader);
	}
	
	public String getName() {
		return name;
	}
	
//	public Author getAuthor() {
//		int index = 0;
//		for(int i = 0; i < authorList.size(); i++) {
//			if (authorList.contains(getName())) {
//				Author author = authorList.get(i);
//				index = i;
//			}else {
//				return null;
//			}
//		}
//		return authorList.get(index);
//	}

	

}
