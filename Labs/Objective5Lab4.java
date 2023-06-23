import java.util.Scanner;

public class Objective5Lab4 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter a number: ");

	int num = scanner.nextInt();

	String parity = "odd";

	if (num % 2 == 0) {
		parity = "even";
	}

	System.out.println("The number is " + parity);
	}
}