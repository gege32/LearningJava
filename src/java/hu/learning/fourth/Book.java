package hu.learning.fourth;

import java.util.ArrayList;
import java.util.List;
import hu.learning.fourth.Author;

public class Book {
	
	private String authorName, title, publisher, publicationYear;
	private Author author;
	List<Book> bookList = new ArrayList<>();

	
	public Book(Author author, String title, String publisher, String publicationYear){
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.publicationYear = publicationYear;
		
	}
	public void askAuthorName(String authorName) {
		System.out.println("Please give the name of the Author:");
		authorName = System.console().readLine();
		int index = 0;
		for(int i = 0; i < author.authorList.size(); i++) {
			if (author.authorList.contains(author.getName())) {
				author = author.authorList.get(index);
			}else {
				System.out.println("This author is not in your list!");
				System.out.println("Would you like to create a new Author? Yes or No?");
				if (System.console().readLine() == "Yes"){
					author.crateAuthor();
				}else {
					System.out.println("Would you like to quit? Yes or No?");
					// quit or back to the main page
				}
					
			}
		}
	}
		
	
	public void askTitle(String title) {
		System.out.println("Please give the title of the book:");
		title = System.console().readLine();
				
	}
	public void askPublisher(String publisher) {
		System.out.println("Please give the publisher of the book:");
		publisher = System.console().readLine();
		
	}
	public void askpublicationYear(String publicationYear) {
		System.out.println("Please give the publication year of the book:");
		publicationYear = System.console().readLine();
		
	}
	public Book crateBook() {
		Book book = new Book(author, title, publisher, publicationYear);
		bookList.add(book);
		return book;
	}
	
}
