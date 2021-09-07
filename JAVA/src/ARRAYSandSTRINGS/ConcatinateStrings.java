package ARRAYSandSTRINGS;

public class ConcatinateStrings {

	public static void main(String[] args) {
		String str1= "Coding";
		String str2= " is fun";
		/*String str3= str1+str2; // to concanitate two strings
		System.out.println(str3);*/
		System.out.println(str1+str2); // it can also be done like this
		String str3=str1.concat(str2); // function=>str1 will get concatinated with str2 and the new string is stored in str3
		System.out.println(str3);// new string will be printed

	}

}
