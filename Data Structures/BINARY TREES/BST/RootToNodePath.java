package BST;

import java.util.ArrayList;
import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class RootToNodePath {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= new BinaryTreeUse().takingInput();
		int x= s.nextInt();
		ArrayList<Integer> ans= rootToNodePath(root,x);
		if(ans!=null) {
		for(int i:ans) {
			System.out.print(i+" ");
		}}
		else {
			System.out.println(ans);
		}

	}

	private static ArrayList<Integer> rootToNodePath(BinaryTreeNode<Integer> root, int x) {
		Pair ans= helper(root,x);
		return ans.returnArray;
		
	}

	private static Pair helper(BinaryTreeNode<Integer> root, int x) {
		if(root==null)
		{
			Pair ans= new Pair();
			ans.isPresent=false;
			return ans;
		}
		
		if(root.data==x) {
			Pair ans= new Pair();
			ArrayList<Integer> returnArray= new ArrayList<>();
			returnArray.add(root.data);
			ans.isPresent=true;
			ans.returnArray=returnArray;
			return ans;	
		}
		boolean isPresent= false;
		
		Pair left= helper(root.left,x);
		Pair right= helper(root.right,x);
		if(left.isPresent)
		{
			ArrayList<Integer> returnArray= new ArrayList<>();
			returnArray.addAll(left.returnArray);
			returnArray.add(root.data);
			Pair ans= new Pair();
			ans.returnArray=returnArray;
			ans.isPresent=left.isPresent;
			return ans;
		}
		if(right.isPresent)
		{
			ArrayList<Integer> returnArray= new ArrayList<>();
			returnArray.addAll(right.returnArray);
			returnArray.add(root.data);
			Pair ans= new Pair();
			ans.returnArray=returnArray;
			ans.isPresent=right.isPresent;
			return ans;
		}
		Pair ans= new Pair();
		ans.isPresent=isPresent;
		return ans;
		
		
	}

}
