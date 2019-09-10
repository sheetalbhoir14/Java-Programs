package Java11;

public class pattern11 {
public static void main(String[] args) {
	
	for(int i=1;i<=4;i++)
	{
		for(int j=4;j>=i;j--)
		{
			System.out.print(i);
		}
		for(int k=1;k<=i;k++)
		{
			System.out.print(" ");
		}
		System.out.println();
	}
}
}
