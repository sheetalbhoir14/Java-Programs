package Java11;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	
	 public static int binarySearch(String arr[], int first, int last, String key){  
	        while(last>=first){  
	            int mid = first + (last - first)/2;  
	            if (arr[mid] == key){  
	            return mid;  
	            }  
	            if (arr[mid].compareTo(key)<0){  
	            return binarySearch(arr, first, mid-1, key);//search in left subarray  
	            }else{  
	            return binarySearch(arr, mid+1, last, key);//search in right subarray  
	            }  
	        }  
	        return -1;  
	    }  
	
public static void main(String[] args) {
		String  arr[]= {"sheetal","bag","net","hit"};
		String  key="net";
	Arrays.sort(arr);
		int last=arr.length-1;
		int result= binarySearch(arr,0,last,key);
		
		if(result==-1)
		{
			System.out.println("Element is not found");
		}
		else {
			
			System.out.println("Element is found at "+result);
		}
	}

}
