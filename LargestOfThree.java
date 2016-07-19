import java.util.InputMismatchException;
import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		double first;
		double second;
		double third;
		Scanner scanner = new Scanner(System.in);
		try {
			first = scanner.nextDouble();
			second = scanner.nextDouble();
			third = scanner.nextDouble();
			double largest = (first > second && first > third) ? first : (second > third) ? second : third;
			System.out.println("the largest of three: " + largest);
		} catch (InputMismatchException exception) {
			System.out.println("Invalid Input");
		}
		scanner.close();

	}
}
