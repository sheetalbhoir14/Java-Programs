package Java11;

public class TransposeOfmatrix {
	
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{5,6,4},{6,2,1}};
		System.out.println("Print oroginal matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Print Transpose matrix: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+arr[j][i]);
			}
			System.out.println();
		}
	}

}
