package Java11;

public class pattern6 {
	public static void main(String[] args) {
		char ch=65;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+ch++);
			}
			System.out.println();
		}
	}

}
