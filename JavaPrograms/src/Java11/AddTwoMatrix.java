package Java11;

public class AddTwoMatrix {
	public static void main(String[] args) {
		
	int arr1[][] = { { 1, 2, 3 }, { 3, 5, 6 }, { 6, 1, 2 } };
	int arr2[][] = { { 1, 2, 3 }, { 3, 5, 6 }, { 6, 1, 2 } };
	int add[][]=new int[3][3];
	
	for(int i=0;i<3;i++)
		
	{
		for(int j=0;j<3;j++)
		{
			add[i][j]=arr1[i][j]+arr2[i][j];
			System.out.print(add[i][j]+" ");
		}
		System.out.println();
	}
}
}
