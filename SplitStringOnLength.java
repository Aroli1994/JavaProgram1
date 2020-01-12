package AllProgramsPack;

public class SplitStringOnLength {

	public static void main(String[] args) {
		String s = "Thequickbrownfoxjumpsoverthelazydog";
		char[] arr = s.toCharArray();

		System.out.println(arr.length);
		int divide = 13;
		for (int i = 0; i < arr.length; i = i + divide) {
			int part = i + divide;
			if (part <= arr.length) {
				System.out.println(s.substring(i, part));
			}
			else{
				System.out.println(s.substring(i));
			}
		}
	}

}
