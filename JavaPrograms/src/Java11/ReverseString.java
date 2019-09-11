package Java11;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		String str;
		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		str = read.nextLine();
		String reverse = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reversed string is:");
		System.out.println(reverse);

		boolean status = str.equals(reverse);
		if (status) {
			System.out.println("Strings are equals");
		} else {
			System.out.println("Strings are not equals");
		}

	}

}
