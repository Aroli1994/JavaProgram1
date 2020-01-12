package AllProgramsPack;

import java.util.Scanner;

public class OccurencesOfEachCharInString {
	static int countSum;
	public static void main(String[] args) {
		String s1, s2 = "", replaceStr="";
		int count = 0;
		char ch;
		int maxCount=0;
		char maxChar = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		s1 = sc.nextLine();
		System.out.println("Length of string:"+s1.length());
		System.out.println("Occurences of each character in string '"+s1+"':");
		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			if (s2.indexOf(ch) == -1) {
				replaceStr=s1.replace(Character.toString(ch), "");
				count=s1.length()-replaceStr.length();
				countSum+=count;
				System.out.println("'"+ch+"'"+" repeats "+count+" times");
				s2+=ch;
				if(count>maxCount){
					maxCount=count;
					maxChar=ch;
				}
			}
		}
		System.out.println("repeated times="+countSum);
		System.out.println("Maximum occuring character:"+maxChar);
	}

}
