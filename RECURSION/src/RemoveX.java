
public class RemoveX {

	public static void main(String[] args) {
		String str= "xabx";
		String ans = removeX(str);
		System.out.print(ans);
	}
	
	public static String removeX(String str)
	{
		if(str=="")
		{
			return str;
		}
		if(str.charAt(0)=='x')
		{
			return removeX(str.substring(1));
		}
		else
		{
			return str.charAt(0)+removeX(str.substring(1));
		}
	}

}
