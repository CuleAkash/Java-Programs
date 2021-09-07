package FUNCTIONSANDSCOPE;

public class overloading {

	public static void main(String[] args) {
		int a=10,b=5;
		int sum1 = sum(a); // it will use the second function as it has onlyu one variable
		int sum2 = sum(a,b); // itt will use first as it has two variable of type integer
		double sum3= sum(2.5,3.7); // it will use third as it has two variable of type double
		
		/* this type of method of naming differint functions by same name and calling them according 
		 * to the no. and type of data passing from the main is called function overloading 
		 */
		
		System.out.print("The sums are: "+ sum1 + " "+ sum2+ " "+ sum3);

	}
	
	public static int sum(int a,int b)
	{
		int sum =a+b;
		return sum;
	}
	
	public static int sum(int a)
	{
		a++;
		return a;
	}
	
	public static double sum(double a,double b)
	{
		double sum =a+b;
		return sum;
	}
	

}
