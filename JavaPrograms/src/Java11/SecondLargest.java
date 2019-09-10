package Java11;

public class SecondLargest {
	public static void main(String[] args) {
		int []arr= {16,14,15,42,81,93};
		int largest=arr[0];
		int secondlargest=arr[0];
		
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i]>largest)
			{
				secondlargest=largest;
				largest=arr[i];
				
			}
			else {
				if(arr[i]>secondlargest)
				{
					secondlargest=arr[i];
				}
			}
		}
		System.out.println("Largest element is: "+largest);
		System.out.println("Second largest element is: "+secondlargest);
	}

}
