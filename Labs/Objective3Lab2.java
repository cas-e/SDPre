public class Objective3Lab2 {
	public static void main(String[] args) {
		double side1, side2, hypotenuse;

		side1 = 10;
		side2 = 8;

		// c^2 = a^2 + b^2
		// c = sqrt(a^2 + b^2)
		hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

		String message = "The hypotenuse of a triangle with sides ";
		System.out.print(message + side1 + " and " + side2 + " is ");
		System.out.print(hypotenuse + "\n");
	}
}