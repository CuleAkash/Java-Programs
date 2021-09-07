
public class ReplacePi {

	public static void main(String[] args) {
		String str= "pix";
		String ans= replace_pi(str);
		System.out.println(ans);
				

	}
	
	public static String replace_pi(String str)
	{
		if(str.length()<=2)
		{
			if(str=="" || str!="pi")
			{
				return str;
			}
			else if(str=="pi")
			{
				return "3.14";
			}
		}
		String output="";
		if(str.substring(0,2)=="pi")
		{
			output+= "3.14"+replace_pi(str.substring(2));
		}
		else
		{
			output+= str.charAt(0)+replace_pi(str.substring(1));
		}
		return output;
	}

}
