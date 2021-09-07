import java.util.Scanner;

public class KeypadReturn {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		String[] ans= return_keypad(n);
		for(int i=0;i<ans.length;i++)
		{
			System.out.println(ans[i]);
		}

	}
	
	public static String[] return_keypad(int n)
	{
		if(n==0)
		{
			String[] ans= {""};
			return ans;
		}
		int n1= n%10;
		char[] ch= find_char(n1);
		String[] smallAns= return_keypad(n/10);
		String[] ans= new String[smallAns.length*ch.length];
		int j=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int k=0;k<smallAns.length;k++)
			{
				ans[j]= smallAns[k]+ch[i];
				j++;
			}
		}
		return ans;
	}
	
	
	
		public static char[] find_char(int n) {
			if(n>=2 && n<=9)
			{
			int size=0;
			if(n<7 || n==8)
			{
				size=3;
			}
			else
			{
				size=4;
			}
			char[] ch= new char[size];
			char c=0;
			if(n<=7) {
			 c= (char)('a'+3*(n-2));}
			else if(n==8) {
				 c= (char)('a'+3*(n-3)+4);}
			else {
				c= (char)(('a'+3*(n-4)+4)+3);}
			for(int k=0;k<size;k++)
			{
				ch[k]= (char)c;
				c++;
						
			}
			return ch;}
			else
			{
				char[] ch= {0};
				return ch;
			}
	}
	

}
