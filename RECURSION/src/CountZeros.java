
public class CountZeros {

	public static void main(String[] args) {
		int n= 10204;
		int count = count_zeros(n);
		System.out.print(count);

	}
	
	private static int count_zeros(int n)
	{
		return count_zeros(n,0);
	}
	
	public static int count_zeros(int n, int count)
	{if(n<10) {
		if(n==0)
		{
			return 1;
		}
		else {
			return 0;
		}}
		if(n%10==0)
		{
			return count_zeros(n/10,++count);
		}
		else
		{
			return count_zeros(n/10,count);
		}
		
		
		
	}

}
