package Java11;

public class JavaABAB {
	public static void main(String[] args) {
		String str="ABAB";
		int counter=0;
		char s[]=str.toCharArray();
		
		for(int i=0;i<s.length;i=i+2)
		{
			if(s[i]=='A' && s[i+1]=='B')
					 {
				counter++;
			}
			else if (s[i]=='B' && s[i+1]=='A')
			{
				counter++;
			}
		}
		if(counter==(s.length/2))
		{
System.out.println("yes");
		}
		else {
			System.out.println("No");
		}
	}
}
