package edu.frcc.csc1061j.MyBookTree;

public class MyBook {

	public static void main(String[] args) {

		MyBookTree myBook = new MyBookTree("Trees for Dummies");
		
		myBook.addBookNode("End", 5, 0, 0);
		myBook.addBookNode("Middle", 3, 0, 0);
		myBook.addBookNode("Almost Done", 4, 0, 0);
		myBook.addBookNode("Beginning", 1, 0, 0);
		myBook.addBookNode("Next", 2, 0, 0);
		
		myBook.addBookNode("End Section", 5, 1, 0);
		myBook.addBookNode("AD Section", 4, 2, 0);
		myBook.addBookNode("Mid Section", 3, 3, 0);
		myBook.addBookNode("Next Section", 2, 4, 0);
		myBook.addBookNode("Begin Section", 1, 5, 0);
		
		myBook.addBookNode("End SubSection", 5, 1, 3);
		myBook.addBookNode("AD SubSection", 4, 2, 2);
		myBook.addBookNode("Mid SubSection", 3, 3, 1);
		myBook.addBookNode("Next SubSection", 2, 4, 5);
		myBook.addBookNode("Begin SubSection", 1, 5, 4);
	
		
		for(MyBookNode node : myBook) {
			System.out.println(node);
		}
		
	}

}
