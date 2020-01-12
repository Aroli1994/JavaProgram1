package AllProgramsPack;

import java.util.Arrays;
import java.util.Scanner;

public class SplitStringIntoEqualParts {

	public static void main(String[] args) {
		String str = "Thequickbrownfoxjumpsoverthelazydog";
		int size =4; 

		String[] tokens = str.split("(?<=\\G.{" + size + "})");
		System.out.println(Arrays.toString(tokens)); 
	}

}


