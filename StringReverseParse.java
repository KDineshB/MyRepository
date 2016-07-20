import java.util.Scanner;

public class StringReverseParse {

	public static void main(String[] args) {
		String string = "";
		String string1 = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		string = scanner.nextLine();
		for (int i = 0; i < string.length(); i++) {
			if (!Character.isWhitespace(string.charAt(i))) {
				string1 += "-" + string.charAt(i);
			} else {
				string1 += " ";
			}
		}
		StringBuffer buffer = new StringBuffer(string1);
		System.out.println(buffer.reverse());
		scanner.close();
	}

}
