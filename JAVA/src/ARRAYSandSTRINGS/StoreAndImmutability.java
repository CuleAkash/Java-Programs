package ARRAYSandSTRINGS;

public class StoreAndImmutability {

	public static void main(String[] args) {
		String str= "abc"; // string constructed by this syntax is stored in the string pool 
		// string pool is memory space in the heap to store string and it came into picture for memory optimisation
		// all primitives and local variables and functions are stored in stack and all non-primitives in heap
		
		String str1 = new String("abc"); // string constructed by this syntax is stored in heap but not in string pool
		boolean isEqual = (str==str1); // it will give false as both the strings are stored at different locations
		// one in the string pool and one outside the string pool
		System.out.println(isEqual);
		
		String str2 = "abc";
		boolean isEqual2= (str==str2); // it will give true as both are to be stored in string pool and here memory optimisation comes in
		// if two same strings are to be stored in string pool then it does not make a new string but only stores the old string reference
		// into the new string str2
		System.out.println(isEqual2);
		
		//str.charAt(0)= 'i'; // it is not allowed as strings are immutable
		str = str +"def"; // it is allowed as it doesn't change the old string but creates an altogether new string "abcdef" and its reference is  
		// stored in the str variable
		
		String str3 = "def";
		String str4 = new String("def");
		boolean isEqual3= (str3==str4);
		System.out.println(isEqual3); // it will give false as both addresses are different
		// str3 is stored in string pool and str4 in heap
		boolean isEqual4= (str3.equals(str4));
		System.out.println(isEqual4);// it will give true as both the contents are same
		
		// to compare two strings we must use equals function as it compares the contents of the two strings 
		// and if we use (==) it will only check the addresses
	}

}
