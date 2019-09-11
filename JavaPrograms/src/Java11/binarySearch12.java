package Java11;

import java.util.Arrays;

public class binarySearch12 {
	 public static int binarySearch(int arr[], int first, int last, int key){  
	        if (last>=first){  
	            int mid = first + (last - first)/2;  
	            if (arr[mid] == key){  
	            return mid;  
	            }  
	            if (arr[mid]>key){  
	            return binarySearch(arr, first, mid-1, key);//search in left subarray  
	            }else{  
	            return binarySearch(arr, mid+1, last, key);//search in right subarray  
	            }  
	        }  
	        return 2;  
	    }  
	    public static void main(String args[]){  
	    	int  arr[]= {20,30,50,40,60};
			int key=50;  
			Arrays.sort(arr);
	        int last=arr.length-1;  
	        int result = binarySearch(arr,0,last,key);  
	        if (result == 2)  
	            System.out.println("Element is not found!");  
	        else  
	            System.out.println("Element is found at index: "+result);  
	    }  

}
