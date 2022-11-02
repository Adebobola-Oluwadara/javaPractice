package javatasks;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
String name = " ";

// isBlank() is a method that checks if a string is empty or not. 
//If name is blank (is blank? True), it will keep running that code
//If it has met the condition, it leaves the block and does the next code
	while (name.isBlank()) {
		System.out.println("What is your name?");
		Scanner obj = new Scanner(System.in);
	    name = obj.nextLine ();	
	}
	System.out.format("Hello %s" , name);
}
}