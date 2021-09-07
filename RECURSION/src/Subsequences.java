
public class Subsequences {

	public static void main(String[] args) {
		String str= "xyz";
		String[] output = subsequences(str);
		for(int i=0;i<output.length;i++)
		{
			System.out.println(output[i]);
		}

	}
	
	public static String[] subsequences(String str)
	{
		if(str.length()==0)
		{
			String[] ans= {""};
			return ans;
		}
		String[] smallAns= subsequences(str.substring(1));
		String[] ans= new String[2*smallAns.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++)
		{
			ans[k]=smallAns[i];
			k++;
		}
		for(int i=0;i<smallAns.length;i++)
		{
			ans[k]= str.charAt(0)+smallAns[i];
			k++;
		}
		return ans;
	}

}
