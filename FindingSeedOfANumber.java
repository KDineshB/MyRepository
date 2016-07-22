import java.util.Scanner;

public class FindingSeedOfANumber {

	public static void main(String[] args) {
		int number;
		boolean seedFlag = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = scanner.nextInt();
		for (int i = 10; i <= number / 2; i++) {
			int n = i;
			int n1 = i;
			while (n1 > 0) {
				n *= n1 % 10;
				n1 = n1 / 10;
			}
			if (n == number) {
				seedFlag = true;
				System.out.println("seed found: " + i);
			}
		}
		if(seedFlag==false){
			System.out.println("No seed found");
		}
		scanner.close();
	}

}
