package AllProgramsPack;

import java.util.Scanner;

public class ExtractIntegersFromString {

	public static void main(String[] args) {
		String s;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		s = sc.nextLine();
		System.out.println("Integers from String " + s + ":");
		char[] cArr = s.toCharArray();
		for (char c : cArr) {
			if (Character.isDigit(c)) {
				System.out.print(c + " ");
				sum += Integer.parseInt(Character.toString(c));
			}
		}
		// System.out.println();
		System.out.println("\nSum=" + sum);
	}

}
