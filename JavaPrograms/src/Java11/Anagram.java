package Java11;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		String str1 = "heart";
		String str2 = "earth";
		boolean status = true;
		if (str1.length() != str2.length()) {
			System.out.println("Strings are not anagram");
		} else {
			char[] arrstr1 = str1.toCharArray();
			char[] arrstr2 = str2.toCharArray();
			Arrays.sort(arrstr1);
			Arrays.sort(arrstr2);
			status = Arrays.equals(arrstr1, arrstr2);
		}
		if (status == true) {
			System.out.println("Strings are anagram");
		} else {

		}

	}
}