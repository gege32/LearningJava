package hu.learning.fourth;

import java.util.ArrayList;
import java.util.List;

public class Author {

	private String name, age, gender; 
	public List<Author> authorList = new ArrayList<Author>();
	
	public Author(String name, String age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public void askName(String name) {
		System.out.println("Please give the name of the Author:");
		name = System.console().readLine();
				
	}
	public void askAge(String age) {
		System.out.println("Please give the age of the Author:");
		age = System.console().readLine();
		
	}
	public void askGender(String gender) {
		System.out.println("Please give the gender of the Author:");
		gender = System.console().readLine();
		
	}
	public Author crateAuthor() {
		askName(name);
		askAge(age);
		askGender(gender);
		Author author = new Author(name, age, gender);
		authorList.add(author);
		return author;
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
