package Java11;

public class WhiteSpace1 {
	public static void main(String[] args) {
		String str="sheetal suresh bhoir";
		char[] arrstr=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(arrstr[i]!=' ')
			{
				System.out.print(arrstr[i]);
			}
		}
	}

}
