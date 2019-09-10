package Java11;

public class pattern8 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		for(int i=5;i<=7;i++)
		{
			for(int j=5;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=7;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
