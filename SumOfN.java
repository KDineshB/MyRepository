import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
		int n = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter N.....");
			n = scanner.nextInt();
			int[] numbers = new int[n];
			System.out.println("Enter N number to sum up: ");
			for (int i = 0; i < numbers.length; i++) {
				numbers[i] = scanner.nextInt();
				sum += numbers[i];
			}
			System.out.println("sum: " + sum);
		} catch (InputMismatchException exception) {
			scanner.close();
			System.out.println("Invalid Input");
		}
		scanner.close();
	}

}
