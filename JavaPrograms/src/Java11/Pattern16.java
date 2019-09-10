package Java11;

public class Pattern16 {
	public static void main(String[] args) {
		int space=8;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
		}
		for(int s=1;s<=space;s++)
		{
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print("*");
		}
		space=space-2;
		System.out.println();
	}
	}
}
