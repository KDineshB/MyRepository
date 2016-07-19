import java.util.InputMismatchException;
import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		long number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try {
			number = scanner.nextInt();
			if (number % 2 == 0) {
				System.out.println("your number is even");
			} else {
				System.out.println("your number is odd");
			}
		} catch (InputMismatchException exception) {
			System.out.println("Invalid Input");
		}
		scanner.close();

	}

}
