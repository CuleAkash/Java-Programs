package ARRAYSandSTRINGS;

public class FunctionsOnStrings {

	public static void main(String[] args) {
		String str1= "coding";
		String str2= "Aoiing";
		System.out.println(str1.compareTo(str2)); // it gives the difference between the ascii value of the mismatched value of the two strings
		char ch = (char)(str1.compareTo(str2)); // to convert the difference in ascii value into the corresponding character, compare function returns int value
		System.out.println(ch); // to print the character
		boolean isEqual= str1.equals(str2); // equals function returns boolean value
		System.out.println(isEqual);// it returns false as both strings are not equal
		boolean contains = str1.contains("ing"); // it returns boolean and tells if the string contains a specific other string
		System.out.println(contains); // it returns true/false corresponding to the containment of the string in str1
		String str3= str1.substring(3);// it gives the string from index 3 to the end of the str1
		System.out.println(str3);
		String str4= str1.substring(0, 5); // it gives the string from index 1 to index(5-1)
		System.out.println(str4);
		str4= str1.substring(6);//if we pass the llength of the string to the substring function 0 will be returned
		System.out.println(str4);
		str4= str1.substring(0, 6); // to print all the characters we have to give arguments from 0 to string length
		System.out.println(str4);
		
	}

}
