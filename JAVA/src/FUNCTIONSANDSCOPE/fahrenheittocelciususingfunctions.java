package FUNCTIONSANDSCOPE;

import java.util.Scanner;

public class fahrenheittocelciususingfunctions {
	public static void Fahrenheit_To_Celcius_Table(int Upper,int Lower,int W)
	{
		for(int i=Lower;i<=Upper;i+=W)
		{
			double C = (double)((5.0/9.0)*(i-32));
			System.out.println(i +"	"+C);
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int Lower,Upper,W;
		System.out.println("Enter the Fahrenheit values:");
		Upper= s.nextInt();
		Lower= s.nextInt();
		System.out.println("The width is:");
		W= s.nextInt();
		System.out.println("The table is:");
		Fahrenheit_To_Celcius_Table(Upper,Lower,W);

	}

}
