import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		StringBuffer string;
		System.out.println("enter a string: ");
		Scanner scanner = new Scanner(System.in);
		string = new StringBuffer(scanner.nextLine());
		string.reverse();
		System.out.println("reversed string: " + string);
		scanner.close();
	}

}
