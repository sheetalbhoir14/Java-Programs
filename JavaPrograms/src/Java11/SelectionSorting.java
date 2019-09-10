package Java11;

public class SelectionSorting {
	
	public static void main(String[] args) 
	{

		int[] arr= {21,5,2,6,7,12};
		int temp;
		int length=arr.length;
		for(int i=0;i<length;i++)
		{
			int index=i;
			{
				for(int j=i+1;j<length;j++) 
				{
					if(arr[j]<arr[index])
					{
						index=j;
					}
				}
				temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				
			}
			
			
		}
		System.out.println("After Selection Sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(+arr[i]+" ");
		}
		
	}

}
