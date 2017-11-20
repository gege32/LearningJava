package hu.learning.fourth;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import hu.learning.ITask;

public class FourthTask implements ITask{
	
	private List<Author> authorList = new ArrayList<Author>();
	
	private List<Book> bookList = new ArrayList<>();
	
	//Ez a program lesz a konyvesbolt nyilvantarto program.
	
	@Override
	public boolean checkExcercise() {
		Scanner reader = new Scanner(System.in);
		
		//Ezt most a programunk fo belepesi pontjanak fogjuk tekinteni
		System.out.println("Welcome to library! What would you like to do?");
		System.out.println("1: Crate a new Author? ");
		System.out.println("2: Crate a new Book? ");
		System.out.println("3: Sorting Authors? ");
		System.out.println("4: Sorting books? ");
		System.out.println("5: Quit! ");
		

		reader.nextLine();
		
		
		while (reader.hasNextLine()) {
			String readLine = reader.nextLine();
			if(readLine.equals("1")) {
				Author author = new Author();
				author.crateAuthor(reader);
				authorList.add(author);
			}else if(readLine.equals("2")){
				Book konyv = new Book();
				try{
					konyv.createBook(reader);
					bookList.add(konyv);
				}catch(Exception ex){
					konyv = null;
					System.out.println("Failure!" + ex);
				}finally{
					
				}
			}else if(readLine.equals("5")){
				break;
			}
		}
		
		reader.close();
		
		return false;
	}

}
