import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class FindIntThatRepeatsFirst {

	public static void main(String[] args) {
		int size;
		System.out.println("enter size");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner scanner = new Scanner(System.in);
		try {
			size = scanner.nextInt();
			int[] integers = new int[size];
			System.out.println("Enter Values");
			for (int i = 0; i < integers.length; i++) {
				integers[i] = scanner.nextInt();
			}

			for (int i = 0; i < integers.length; i++) {
				if (map.containsKey(integers[i])) {
					map.put(integers[i], map.get(integers[i]) + 1);
					if (map.get(integers[i]) == 2) {
						System.out.println(integers[i]);
						break;
					}
				} else {
					map.put(integers[i], 1);
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("only integers");
		} finally {
			scanner.close();
		}

	}

}
