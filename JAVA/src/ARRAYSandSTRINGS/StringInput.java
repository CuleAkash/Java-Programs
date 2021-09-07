package ARRAYSandSTRINGS;

import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);// input=> My Akash
		String str1= s.next(); // it will get only My and then there is a " " delimiter so it wont get any more tokens
	//	int i = s.nextInt();// input mismatch is shown as there is already akash in the scanner which is not int type
		//String str2= s.nextLine();// as My is already taken by str1 remaining string will be aquired  by str2
		String str2= s.nextLine(); // it will now aquire the remaining string until "\n" only
		System.out.println(str1);
		System.out.println(str2);

	}

}
