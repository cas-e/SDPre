import java.util.Scanner;

public class Objective4Lab2 {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int num1 = 0, num2 = 0, num3 = 0;
		double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;


		// input message helpers
		String msgL = "Please enter the ";
		String msgR = "number you would like to add.\n>> ";

		// get user input for ints
		System.out.print(msgL + "first whole " + msgR);
		num1 = keyboard.nextInt();

		System.out.print(msgL + "second whole " + msgR);
		num2 = keyboard.nextInt();

		System.out.print(msgL + "third whole " + msgR);
		num3 = keyboard.nextInt();


		// get user input for doubles
		System.out.print(msgL + "first decimal " + msgR);
		dub1 = keyboard.nextDouble();
		
		System.out.print(msgL + "second decimal " + msgR);
		dub2 = keyboard.nextDouble();
		
		System.out.print(msgL + "third decimal " + msgR);
		dub3 = keyboard.nextDouble();


		// calculations
		int sumNums = num1 + num2 + num3;
		double sumDubs = dub1 + dub2 + dub3;



		// print ints and sum of ints
		System.out.print("The sum of ");
		System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sumNums);

		// print doubles and sum of doubles
		System.out.print("The sum of ");
		System.out.println(dub1 + " + " + dub2 + " + " + dub3 + " = " + sumDubs);

	}
}