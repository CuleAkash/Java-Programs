package MatrixChainMultiplications;

import java.util.HashMap;
import java.util.Scanner;

public class ScrambledString {
	
	static HashMap<String,Boolean> map= new HashMap<>();

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a= s.next();
		String b= s.next();
		
		boolean ans= scrambledStringRecursive(a,b);
		System.out.println(ans);
		
		boolean ansIterative= scrambledStringIterative(a,b);
		System.out.println(ansIterative);

	}

	private static boolean scrambledStringIterative(String a, String b) {
		if(a.length()!=b.length()) {
			return false;
		}
//		String str= a+" "+b;
//		System.out.println(str);
		
		if(a.length()==0 && b.length()==0) {
			return true;
		}
		
		return solveIterative(a,b);
	}

	private static boolean solveIterative(String a, String b) {
		if(a.compareTo(b)==0) {
			return true;
		}//if both string are same return false
		
		if(a.length()<=1) {
			return false;
		}
		//If their lengths are less than equal to 1 and they are not same return false
		
		String key= a+" "+b;
		if(map.containsKey(key)) {
			return map.get(key);
		}
		int n= a.length();
		
		boolean flag=false;//Assuming that the two strings are not scrambled
		
		for(int i=1;i<=n-1;i++) {
			boolean swapCond= solveRecursive(a.substring(0,i), b.substring(n-i,n)) && solveRecursive(a.substring(i,n), b.substring(0,n-i));
			//If swapping is done at that level
			
			boolean noSwapCond= solveRecursive(a.substring(0,i), b.substring(0,i)) && solveRecursive(a.substring(i,n), b.substring(i,n));
			//If no swapping
			
			if(swapCond || noSwapCond) {
				flag= true;
			}
			//If the two substring are scrambled either by swapping or not swapping flag==true
		}
		map.put(key, flag);
		return flag;
		
	}

	private static boolean scrambledStringRecursive(String a, String b) {
		if(a.length()!=b.length()) {
			return false;
		}
//		String str= a+" "+b;
//		System.out.println(str);
		
		if(a.length()==0 && b.length()==0) {
			return true;
		}
		
		return solveRecursive(a,b);
	}

	private static boolean solveRecursive(String a, String b) {
		if(a.compareTo(b)==0) {
			return true;
		}//if both string are same return false
		
		if(a.length()<=1) {
			return false;
		}
		//If their lengths are less than equal to 1 and they are not same return false
		
		boolean flag=false;//Assuming that the two strings are not scrambled
		int n= a.length();
		
		for(int i=1;i<=n-1;i++) {
			boolean swapCond= solveIterative(a.substring(0,i), b.substring(n-i,n)) && solveIterative(a.substring(i,n), b.substring(0,n-i));
			//If swapping is done at that level
			
			boolean noSwapCond= solveIterative(a.substring(0,i), b.substring(0,i)) && solveIterative(a.substring(i,n), b.substring(i,n));
			//If no swapping
			
			if(swapCond || noSwapCond) {
				flag= true;
			}
			//If the two substring are scrambled either by swapping or not swapping flag==true
		}
		return flag;
		
	}

}
