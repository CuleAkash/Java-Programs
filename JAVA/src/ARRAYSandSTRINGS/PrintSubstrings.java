package ARRAYSandSTRINGS;

public class PrintSubstrings {

	public static void main(String[] args) {
		String str = "string";
		print_substring(str);

	}
	
	public static void print_substring(String str)
	{
		int n = str.length();
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(str.substring(i, j+1));
				System.out.println();
			}
		}
	}

}
