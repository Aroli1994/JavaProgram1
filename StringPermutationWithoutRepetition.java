package AllProgramsPack;

import java.util.Scanner;

public class StringPermutationWithoutRepetition {
	static int count;
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		s=sc.nextLine();
		printPermutation(s, "");
	}

	private static void printPermutation(String string, String permutation) {

		if (string.length() == 0) {
			System.out.println(permutation);
			return;
		}

		for (int i = 0; i < string.length(); i++) {
			char toAppendToPermutation = string.charAt(i);
			String remaining = string.substring(0, i) + string.substring(i + 1);

			printPermutation(remaining, permutation + toAppendToPermutation);
			count++;
		}
	}
}
