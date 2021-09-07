package FUNCTIONSANDSCOPE;

public class series25 {

	public static void main(String[] args) {
		double a=2,n=4;
		double sum= series(a,n);
		System.out.println("The sum of the series is: " + sum);

	}
	
	public static double series(double a,double n)
	{
		int count=0;
		double sum=0;
		for(int i=2;;i+=3)
		{
			sum+= (i-1)/Math.pow(a, i);
			count++;
			if(count==n)
			{
				return sum;
			}
		}
	}

}
