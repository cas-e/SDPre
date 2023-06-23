import java.util.Scanner;

public class Objective4Lab1 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String fname = "";
		String lname = "";
		String favoriteAnimal = "";
		String favoriteFood = "";
		String favoriteSong = "";

		// get input
		System.out.print("What is your first name?\n>> ");
		fname = keyboard.nextLine();	
		
		System.out.print("What is your last name?\n>> ");
		lname = keyboard.nextLine();	
		
		System.out.print("What is your favorite animal?\n>> ");
		favoriteAnimal = keyboard.nextLine();
		
		System.out.print("What is your favorite food?\n>> ");
		favoriteFood = keyboard.nextLine();
		
		System.out.print("What is your favorite song?\n>> ");
		favoriteSong = keyboard.nextLine();	

		// diplay output
		System.out.println("My name is " + fname + " " + lname + ".");
		System.out.println("My favorite animal is the " + favoriteAnimal + ".");
		System.out.println("My favorite food is " + favoriteFood + ".");
		System.out.println("My favorite song is " + favoriteSong + ".");
	}
}