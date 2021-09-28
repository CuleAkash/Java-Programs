package MatrixChainMultiplications;

import java.util.HashMap;
import java.util.Scanner;

public class BooleanParenthesization {
	
	  static HashMap<Triplet, Integer> map= new HashMap<>();

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.next();
		
		int ansRecursive= booleanParenthesizationRecursive(s);
		System.out.println(ansRecursive);
		
		int ansIterative= booleanParenthesizationIterative(s);
		System.out.println(ansIterative);
	
		
	}
	
	
	
	
	
	private static int booleanParenthesizationIterative(String s) {
		return solveIterative(s,0,s.length()-1,true);
	}


	private static int solveIterative(String s, int i, int j, boolean isTrue) {
		if(i>j) {
			return 0;
		}
		
		if(i==j) {
			if(isTrue==true) {
				return s.charAt(i)=='T'?1:0;
			}
			else {
				return s.charAt(i)=='F'?1:0;
			}
		}
		
		Triplet t= new Triplet(i,j,isTrue);
		
		if(map.containsKey(t)){
		    return map.get(t);
		}
		
		int ans=0;
		
		for(int k=i+1;k<=j-1;k+=2) {
			int leftTrue=0,leftFalse=0,rightTrue=0,rightFalse=0;
			Triplet lT= new Triplet(i,k-1,true);
			Triplet lF= new Triplet(i,k-1,false);
			Triplet rT= new Triplet(k+1,j,true);
			Triplet rF= new Triplet(k+1,j,false);
			
			//created key value pairs for different combinations and if that key is present in hashmap we wont calculate it again
			if(map.containsKey(lT)) {
				leftTrue= map.get(lT);
			}
			else {
				leftTrue+= solveIterative(s, i, k-1, true);
				map.put(lT, leftTrue);
			}
			
			if(map.containsKey(lF)) {
				leftFalse= map.get(lF);
			}
			else {
				leftFalse+= solveIterative(s, i, k-1, false);
				map.put(lF, leftFalse);
			}
			
			if(map.containsKey(rT)) {
				rightTrue= map.get(rT);
			}
			else {
				rightTrue+= solveIterative(s, k+1, j, true);
				map.put(rT, rightTrue);
			}
			
			if(map.containsKey(rF)) {
				rightFalse= map.get(rF);
			}
			else {
				rightFalse+= solveIterative(s, k+1, j, false);
				map.put(rF, rightFalse);
			}
			
			
			if(s.charAt(k)=='&') {
				if(isTrue==true) {
					ans+= leftTrue*rightTrue;//if the operator is & it will return true only if both ep. are true
				}
				else {
					ans+= leftTrue*rightFalse + leftFalse*rightFalse + leftFalse*rightTrue;
				}
			}
			else if(s.charAt(k)=='|') {
				if(isTrue==true) {
					ans+= leftTrue*rightTrue + leftFalse*rightTrue + leftTrue*rightFalse;// if the operattor is OR it will return true if any one is true
				}
				else {
					ans+= leftFalse*rightFalse;
				}
			}
			else if(s.charAt(k)=='^') {
				if(isTrue==true) {
					ans+= leftTrue*rightFalse + leftFalse*rightTrue;//if the operator is XOR it will give true only if both are complement
				}
				else {
					ans+= leftFalse*rightFalse + leftTrue*rightTrue;
				}
			}	
			
		}
		return ans;
	}





	//Recursive solution
	private static int booleanParenthesizationRecursive(String s) {
		return solveRecursive(s,0,s.length()-1,true);
	}

	private static int solveRecursive(String s, int i, int j, boolean isTrue) {
		if(i>j) {
			return 0;
		}
		
		if(i==j) {
			if(isTrue==true) {
				return s.charAt(i)=='T'?1:0;
			}
			else {
				return s.charAt(i)=='F'?1:0;
			}
		}
		
		int ans=0;
		for(int k=i+1;k<=j-1;k+=2) {
			int leftTrue= solveRecursive(s, i, k-1, true);//conditions where left exp. is true
			int leftFalse= solveRecursive(s, i, k-1, false);//conditions where left exp. is false
			
			int rightTrue= solveRecursive(s, k+1, j, true);//conditions where right exp. is true
			int rightFalse= solveRecursive(s, k+1, j, false);//conditions where right exp. is false
			
			if(s.charAt(k)=='&') {
				if(isTrue==true) {
					ans+= leftTrue*rightTrue;//if the operator is & it will return true only if both ep. are true
				}
				else {
					ans+= leftTrue*rightFalse + leftFalse*rightFalse + leftFalse*rightTrue;
				}
			}
			else if(s.charAt(k)=='|') {
				if(isTrue==true) {
					ans+= leftTrue*rightTrue + leftFalse*rightTrue + leftTrue*rightFalse;// if the operattor is OR it will return true if any one is true
				}
				else {
					ans+= leftFalse*rightFalse;
				}
			}
			else if(s.charAt(k)=='^') {
				if(isTrue==true) {
					ans+= leftTrue*rightFalse + leftFalse*rightTrue;//if the operator is XOR it will give true only if both are complement
				}
				else {
					ans+= leftFalse*rightFalse + leftTrue*rightTrue;
				}
			}
		}
		return ans;
	}

}
