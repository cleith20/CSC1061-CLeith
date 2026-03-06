package edu.frcc.csc1061j.MyBookTree;

public class MyBook {

	public static void main(String[] args) {

		MyBookTree myBook = new MyBookTree("Trees for Dummies");
		
		myBook.addBookNode("Chapter 5", 5, 0, 0);
		myBook.addBookNode("Chapter 3", 3, 0, 0);
		myBook.addBookNode("Chapter 4", 4, 0, 0);
		myBook.addBookNode("Chapter 1", 1, 0, 0);
		myBook.addBookNode("Chapter 2", 2, 0, 0);
		
		myBook.addBookNode("Section 5.1", 5, 1, 0);
		myBook.addBookNode("Section 4.2", 4, 2, 0);
		myBook.addBookNode("Section 3.3", 3, 3, 0);
		myBook.addBookNode("Section 2.4", 2, 4, 0);
		myBook.addBookNode("Section 1.5", 1, 5, 0);
		
		myBook.addBookNode("Section 5.1.3", 5, 1, 3);
		myBook.addBookNode("Section 4.2.2", 4, 2, 2);
		myBook.addBookNode("Section 3.3.1", 3, 3, 1);
		myBook.addBookNode("Section 2.4.5", 2, 4, 5);
		myBook.addBookNode("Section 1.5.4", 1, 5, 4);
	
		
		for(MyBookNode node : myBook) {
			System.out.println(node);
		}
	}

}
