package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int[] arr= {10,10,20,20,20,30};
		ArrayList<Integer> ans= removeDuplicates(arr);
		for(int i=0;i<ans.size();i++)
		{
			System.out.println(ans.get(i)); 
		}
	}
	
	public static ArrayList<Integer> removeDuplicates(int[] arr)
	{
		ArrayList<Integer> ans= new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i==0)
			{
				ans.add(arr[i]);
			}
			else
			{
				if(arr[i]!=arr[i-1])
				{
					ans.add(arr[i]);
				}
			}
		}
		return ans;
	}

}
