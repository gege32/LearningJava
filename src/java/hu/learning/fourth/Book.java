package hu.learning.fourth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hu.learning.fourth.Author;

public class Book {
	
	private String authorName, title, publisher, publicationYear;
	private Author author;

	
	public Book(Author author, String title, String publisher, String publicationYear){
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
	}
	
	public Book(){}
	
	public void askAuthorName(Scanner reader) throws Exception {
		System.out.println("Please give the name of the Author:");
		authorName = reader.nextLine();
		int index = 0;
		
		throw new Exception("Author not found");
		
//		for(int i = 0; i < author.authorList.size(); i++) {
//			if (author.authorList.contains(author.getName())) {
//				author = author.authorList.get(index);
//			}else {
//				System.out.println("This author is not in your list!");
//				System.out.println("Would you like to create a new Author? Yes or No?");
//				if (System.console().readLine() == "Yes"){
//					author.crateAuthor();
//				}else {
//					System.out.println("Would you like to quit? Yes or No?");
//					// quit or back to the main page
//				}
//					
//			}
//		}
	}
		
	public void askTitle(Scanner reader) {
		System.out.println("Please give the title of the book:");
		title = reader.nextLine();
				
	}
	public void askPublisher(Scanner reader) {
		System.out.println("Please give the publisher of the book:");
		publisher = reader.nextLine();
		
	}
	public void askpublicationYear(Scanner reader) {
		System.out.println("Please give the publication year of the book:");
		publicationYear = reader.nextLine();
		
	}
	
	public void createBook(Scanner reader) throws Exception {
		askAuthorName(reader);
		askpublicationYear(reader);
		askPublisher(reader);
		askTitle(reader);
	}
	
}
