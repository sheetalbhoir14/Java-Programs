package Java11;

public class BubbleSort {
	public static void main(String[] args) {
		
		int arr[]= {21,5,1,2,6,7,12};
		int temp;
	
		 for(int i=0;i<=arr.length;i++)
		 {
		
			 for(int j=1;j<=arr.length-1;j++)
			 {
				 if(arr[j]<arr[j-1])
				 {
					 temp=arr[j-1];
					 arr[j-1]=arr[j];
					 arr[j]=temp;
					
			 }
			 
		 }
		 
	}
		 System.out.println("After Sorting element: ");
		 for(int i=0;i<=arr.length-1;i++)
		 {
			 System.out.println(" "+arr[i]);
		 }
		
	}
	}
