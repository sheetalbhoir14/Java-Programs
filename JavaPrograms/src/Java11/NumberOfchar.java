package Java11;

public class NumberOfchar {
	public static void main(String[] args) {
		String str = "grass is greener on the other side";
		int min, max, i, j;
		char minChar = str.charAt(0);
		char maxChar = str.charAt(0);
		int[] freq = new int[str.length()];

		char string[] = str.toCharArray();

		for (i = 0; i < string.length; i++) 
		{
			freq[i] = 1;
			for (j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					freq[i]++;

					string[j] = '0';
				}
			}
		}
		min = max = freq[0];
		for (i = 0; i < freq.length; i++) {

			if (min >freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			
		}
		if (max < freq[i]) {
			max = freq[i];
			maxChar = string[i];
		}
		}
		System.out.println("Minimum occurring character: " + minChar);
		System.out.println("Maximum occurring character: " + maxChar);
	}
}