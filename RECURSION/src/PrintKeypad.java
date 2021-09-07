import java.util.Scanner;

public class PrintKeypad {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		print_keypad(n);

	}
	
	public static void print_keypad(int n)
	{
		print_keypad(n,"");
	}
	
	public static void print_keypad(int n, String output)
	{
		if(n==0)
		{
			System.out.println(output);
			return;
		}
		int r= n%10;
		char[] ch= find_char(r);
		for(int i=0;i<ch.length;i++)
		{
			print_keypad(n/10, output+ch[i]);
		}
		
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
