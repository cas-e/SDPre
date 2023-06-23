import java.util.Scanner;

public class Objective5Lab1 {
	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 15;

		String text = " is greater than ";

		if (num1 > num2) {
			System.out.println(num1 + text + num2);
		}
		else if (num2 > num1) {
			System.out.println(num2 + text + num1);
		}
	}
}