public class Objective3Lab3 {
	public static void main(String[] args) {
		int first, second, third;

		// 3 random numbers between 1 and 6 inclusive
		first = 1 + (int)(Math.random() * 6);
		second = 1 + (int)(Math.random() * 6);
		third = 1 + (int)(Math.random() * 6);

		int sum = first + second + third;

		System.out.print(first + " + " + second + " + ");
		System.out.println(third + " = " + sum);
		
	}
}