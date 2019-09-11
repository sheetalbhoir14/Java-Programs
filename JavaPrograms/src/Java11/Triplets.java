package Java11;

public class Triplets {
	public static void main(String[] args) {
		int arr[]= {6,5,1,2,8,9};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				for(int k=j+1;k<=arr.length-2;k++)
				{
					if(arr[i]+arr[j]+arr[k]==15)
					{
						count++;
						System.out.print("Triplets of sum is 15: "+arr[i]+" "+arr[j]+" "+arr[k]);
						System.out.println();
					}
			
				}
			}
		}
			
	}

}
