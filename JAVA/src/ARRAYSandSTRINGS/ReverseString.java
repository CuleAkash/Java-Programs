package ARRAYSandSTRINGS;

public class ReverseString {

	public static void main(String[] args) {
		String str= "Akash Kuki";
		String reversedString = reverse_String(str);
		System.out.println(reversedString);

	}
	
	public static String reverse_String(String str)
	{
		String str1= "";
/*	for(int i=str.length()-1;i>=0;i--)
		{
			str1= str1+str.charAt(i);
		}*/
		
		for(int i=0;i<str.length();i++)
		{
			str1= str.charAt(i)+str1; // 'a' + 'b'= "ab"
		}
		
		return str1;
	}

}
