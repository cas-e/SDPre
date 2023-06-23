import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args) {
		int birthYear, age, currentYear;

		birthYear = 0;
		currentYear = 2023;

		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");


		age = input.nextInt();
		birthYear = currentYear - age;


		System.out.println("You were born in " + birthYear);

		/*  I know this is just an exercise in getting input, so what follows 
		    is a pretend analyis in order to practice communicating possible problems...

			Note:
		 	If the user's birthday occurs after the current day within the year,
			the results are off by one.

			TODO: either ask for birthday and adjust program or report margin of error to user.     
		*/

	}
}