package RecursionProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnKeypad {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] arr= {2,3,4};
		ArrayList<String> ans= possibleWords(arr,arr.length);
		
		for(String i: ans) {
			System.out.println(i);
		}

	}
	 static ArrayList <String> possibleWords(int a[], int N)
	    {
	         return helper(a,0,N-1);
	    }
	    
	    static ArrayList<String> helper(int[] arr, int start, int end){
	        ArrayList<String> ans= new ArrayList<>();
	        if(start>end){
	            ans.add("");
	            return ans;
	        }
	        
	        ArrayList<String> digitString= digit(arr[start]);
	        ArrayList<String> smallAns= helper(arr,start+1,end);
	        
	        for(int a=0;a<digitString.size();a++){
	            for(int i=0;i<smallAns.size();i++){
	            	ans.add(digitString.get(a)+smallAns.get(i));
	            }
	        }
	        return ans;
	    }
	    
	    static ArrayList<String> digit(int n){
	        ArrayList<String> ans= new ArrayList<String>();
	       if(n>=2 && n<=9){
	           
	           if(n==2){
	               ans.add("a");
	               ans.add("b");
	               ans.add("c");
	           }
	           else if(n==3){
	               ans.add("d");
	               ans.add("e");
	               ans.add("f");
	           }
	           else if(n==4){
	               ans.add("g");
	               ans.add("h");
	               ans.add("i");
	           }
	           else if(n==5){
	               ans.add("j");
	               ans.add("k");
	               ans.add("l");
	           }
	           else if(n==6){
	               ans.add("m");
	               ans.add("n");
	               ans.add("o");
	           }
	           else if(n==7){
	               ans.add("p");
	               ans.add("q");
	               ans.add("r");
	               ans.add("s");
	           }
	           else if(n==8){
	               ans.add("t");
	               ans.add("u");
	               ans.add("v");
	           }
	           else if(n==9){
	               ans.add("w");
	               ans.add("x");
	               ans.add("y");
	               ans.add("z");
	           }
	       }
	       
	       return ans;
	    }

}
