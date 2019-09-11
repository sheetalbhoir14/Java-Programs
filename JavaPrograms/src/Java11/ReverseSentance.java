package Java11;

import java.util.Scanner;

public class ReverseSentance {
	public static void main(String[] args) {
		String str;
		String word="";
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		char[] ch=str.toCharArray(); 
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=' ')
			{
				word=word+ch[i];
			}
			else
			{
				for (int j=word.length();j>0;j--)
				{
					 System.out.print(word.charAt(j-1)); 	 
				}
				 System.out.print(" "); 	
				  word="";
			}
			
		}
		
		for(int j=word.length();j>0;j--)
		{
			   System.out.print(word.charAt(j-1)); 	   
		}
	}

}
