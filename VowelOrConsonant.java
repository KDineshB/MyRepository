import java.io.IOException;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char c;
		boolean flag = false;
		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println("Enter a character");
		try {
			c = ((char) System.in.read());
			c = Character.toLowerCase(c);
			if (!Character.isLetter(c)) {
				throw new IOException();
			}
			for (int i = 0; i < vowels.length; i++) {
				if (vowels[i] == c) {
					flag = true;
				}
			}
			if (flag == true) {
				System.out.println("the character is a vowel");
			} else {
				System.out.println("the character is a consonant");
			}
		} catch (IOException exception) {
			System.out.println("Invalid input");
		}
	}

}
