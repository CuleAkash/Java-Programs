
public class RemoveDuplicates {

	public static void main(String[] args) {
		String str= "xxxyyyzwwzzz";
		String ans= remove_duplicates(str);
		System.out.println(ans);

	}
	
	
	
	/*public static String remove_duplicates(String str)
	{
		if(str=="")
		{
			return str;
		}
		String ans="";
		ans+= str.charAt(0);
		int i=1;
		
		while(i<str.length()) {
		if(str.charAt(i)==str.charAt(0))
		{
			i++;
		}
		else {
			break;
		}}
		return ans+ remove_duplicates(str.substring(i));
	}*/
	public static String remove_duplicates(String str)
	{
		if(str.length()<=1)
		{
			return str;
		}
		
		String smallAns= remove_duplicates(str.substring(1));
		
		if(smallAns.charAt(0)==str.charAt(0))
		{
			return smallAns;
		}
		else
		{
			return str.charAt(0)+smallAns;
		}}
}
