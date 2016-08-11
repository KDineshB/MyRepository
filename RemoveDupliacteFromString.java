import java.util.Scanner;

public class RemoveDupliacteFromString {

	public static void main(String[] args) {
		String string = new String();
		String stringWithoutDuplicate = "";
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		for (int i = 0; i < string.length(); i++) {
			if (!stringWithoutDuplicate.contains("" + string.charAt(i))) {
				stringWithoutDuplicate += string.charAt(i);
			}
		}
		System.out.println(stringWithoutDuplicate);
		scanner.close();
	}

}
