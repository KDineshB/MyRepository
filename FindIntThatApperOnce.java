package hunter;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class FindIntThatApperOnce {

	public static void main(String[] args) {
		class ConstraintOverride extends Exception {
			/**
			* 
			*/
			private static final long serialVersionUID = 1L;
			String message = "Constraint Override";

			@Override
			public String getMessage() {
				return message;
			}
		}
		int size;
		System.out.println("enter size");
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Scanner scanner = new Scanner(System.in);
		try {
			size = scanner.nextInt();
			int[] integers = new int[size];
			for (int i = 0; i < integers.length; i++) {
				integers[i] = scanner.nextInt();
				if (map.containsKey(integers[i])) {
					map.put(integers[i], map.get(integers[i]) + 1);
					if (map.get(integers[i]) > 2) {
						throw new ConstraintOverride();
					}
				} else {
					map.put(integers[i], 1);
				}
			}
			// Finding Integer that appear once
			for (int i : integers) {
				if (map.get(i) == 1) {
					System.out.println(i);
					break;
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("only integers");
		} catch (ConstraintOverride e) {
			System.out.println(e.getMessage());
		} finally {
			scanner.close();
		}

	}

}
