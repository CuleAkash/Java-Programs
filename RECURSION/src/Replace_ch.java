
public class Replace_ch {

	public static void main(String[] args) {
	String str ="abacd";
	String ans = replace_ch(str);
	System.out.println(ans);
		
		

	}
	public static String replace_ch(String str)
	{
		if(str=="")
		{
			return str;
		}
		String ans="";
		if(str.charAt(0)=='a')
		{
			ans+= 'x';
		}
		else
		{
			ans+= str.charAt(0);
		}
		
		return ans+ replace_ch(str.substring(1));
	}
	
}