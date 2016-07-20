import java.util.Scanner;

public class NumberOfVowels {

	public static void main(String[] args) {
		String string;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		string = scanner.nextLine().toLowerCase();
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		for (int i = 0; i < string.length(); i++) {
			for (int j = 0; j < vowels.length; j++) {
				if (string.charAt(i) == vowels[j]) {
					count++;
				}
			}
		}
		System.out.println("vowel count " + count);
		scanner.close();
	}

}
