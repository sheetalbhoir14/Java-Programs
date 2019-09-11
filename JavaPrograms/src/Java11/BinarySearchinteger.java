package Java11;

public class BinarySearchinteger {

	public static int binary(int arr[], int key) {
		int first = 0;
		int last = arr.length;
		while (last >= first) {
			int mid = first + (last - first) / 2;

			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				first = mid + 1;
			} else {
				last = mid - 1;
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 6, 8, 9, 1, 7 };
		int key = 7;
		int last = arr.length - 1;
		int result = binary(arr, key);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at " + "index " + result);
	}

}
