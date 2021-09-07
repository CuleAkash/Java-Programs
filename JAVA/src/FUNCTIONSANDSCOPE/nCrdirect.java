package FUNCTIONSANDSCOPE;

public class nCrdirect {
	public static int factorial(int n)// function to calculation the factorial and return the value to the nCr function
	{int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static int nCr(int n,int r) //function to calculate the nCr value and return it to the main function
	{
		int factN = factorial(n); // factorial function is called and factN is modified
		int factR= factorial(r);   // factorial function is called and factR is modified
		int factNR= factorial(n-r);  // factorial function is called and factNR is modified
		int nCr = factN/(factR*factNR);
		return nCr;
	}

	public static void main(String[] args) {
		int n=10,r=2;
		int result= nCr(10,2); //here the nCr function is called 
		System.out.println("The nCr value is result: "+ result);

	}

}
