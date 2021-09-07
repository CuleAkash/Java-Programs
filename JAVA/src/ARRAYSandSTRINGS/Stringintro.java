package ARRAYSandSTRINGS;

import java.util.Scanner;

public class Stringintro {

	public static void main(String[] args) {
		/*char[] ch = new char[5];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			ch[i]= s.next().charAt(0);
		}
		for(int i=0;i<5;i++)
		{
			System.out.print(ch[i]+ " ");
		}*/ //creating an character array but string is a better option as we can access several characters of a string at once without using loops
		
	/*	String str= "Coding";
		char c= str.charAt(2);// to access the elemeent at index 2 of string str
		System.out.println(c);// it will print d */
		
		String str= "Coding ";
		System.out.println(str.length()); // " " will also occupy one index in the string str
		System.out.println(str.charAt(5)); // it will give character at index 5
		System.out.println(Integer.MAX_VALUE); // it is the maximum length of a string
		System.out.println();
		Scanner s= new Scanner(System.in);// taking input of a new string
		str = s.nextLine();
		System.out.println(str.length()); //length of the string
		System.out.println(str.charAt(0));
		System.out.println(str);// printing the string
		String str2= "";// empty string with zero elemets
		System.out.println(str2.length());// length of an empty string is zero
				

	}

	}


