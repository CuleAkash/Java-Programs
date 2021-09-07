package RecursionProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturnSubsetOfArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] input= new int[size];
		for(int i=0;i<size;i++) {
			input[i]=s.nextInt();
		}
		
		ArrayList<ArrayList<Integer>> ans= returnSubset(input);
		for(ArrayList<Integer> i: ans) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		

	}

	private static ArrayList<ArrayList<Integer>> returnSubset(int[] input) {
		return helper(input,0,input.length-1);
	}

	private static ArrayList<ArrayList<Integer>> helper(int[] input, int start, int end) {
		ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
		if(start>end) {
			ArrayList<Integer> temp= new ArrayList<>(1);
			ans.add(temp);
			return ans;
		}
		
		ArrayList<ArrayList<Integer>> smallAns= helper(input, start+1, end);
		
		
		for(int i=0;i<smallAns.size();i++) {
			ArrayList<Integer> temp= smallAns.get(i);
			temp.add(input[start]);
			ans.add(temp);
		}
		return ans;
	}

}
