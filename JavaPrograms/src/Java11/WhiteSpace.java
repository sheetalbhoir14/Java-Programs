package Java11;

import java.util.Scanner;

public class WhiteSpace {
	public static void main(String[] args) {
		String str;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		String [] st=str.split(" ");
		
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]);
		}
		
		System.out.println();
		
		
		char [] str1=str.toCharArray();
		for(int i=0;i<str1.length;i++)
		{
			if(str1[i]!=' ')
			{
				System.out.print(str1[i]);
			}
		}
		
	}

}
