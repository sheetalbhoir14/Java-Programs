package Java11;

public class BinarySearch22 {

	public static int binarySearch(String[] arr, String x) {
		int first = 0, last = arr.length - 1;
		while (first <= last) {
			int mid = first + (last- first) / 2;

			int res = x.compareTo(arr[mid]);

			if (res == 0)
				return mid;

			if (res > 0)
				first= mid + 1;

			else
				last = mid- 1;
		}

		return -1;
	}
	
	  public static void main(String []args) 
	    { 
	        String[] arr = { "contribute", "geeks", "ide", "practice"}; 
	        String x = "practice"; 
	        int result = binarySearch(arr, x); 
	  
	        if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at "
	                              + "index " + result); 
	    } 
}
