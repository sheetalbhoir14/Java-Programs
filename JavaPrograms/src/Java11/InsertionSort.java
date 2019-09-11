package Java11;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {21,5,2,6,7,12};
		int temp;
		int length=arr.length;
		
		for(int i=0;i<length;i++)
		{
			temp=arr[i];
			int j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		System.out.println("After sorting of array: ");
		for(int i=0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
