import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer");
		try {
			number = scanner.nextInt();
			if (number < 0) {
				System.out.println("Negative");
			} else if (number > 0) {
				System.out.println("Positive");
			} else if (number == 0) {
				System.out.println("Number is zero");
			}
		} catch (InputMismatchException e) {
			System.out.println("Enter an Integer");
		}
		scanner.close();
	}
}
