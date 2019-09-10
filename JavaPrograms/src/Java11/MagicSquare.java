package Java11;

import java.util.Scanner;

public class MagicSquare {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number of element: ");
		n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element of an array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element of an array: ");
		for(int i=0;i<n;i++)
		{
			
			System.out.print(" "+arr[i]);
			
		}
				
	}

}
