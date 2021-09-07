
public class PairStar {

	public static void main(String[] args) {
		String input= "hello";
		String output = pair_star(input);
		System.out.println(output);

	}
	
	public static String pair_star(String s)
	{
		if(s.length()<=1)
		{
			return s;
		}
		String smallAns= pair_star(s.substring(1));
		if(s.charAt(0)==smallAns.charAt(0))
		{
			return s.charAt(0)+"*"+smallAns;
		}
		else
		{
			return s.charAt(0)+smallAns;
		}
	}

}
