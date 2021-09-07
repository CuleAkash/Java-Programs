package BST;

import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class FindNodeinBST {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		boolean isPresent= nodePresent(root,x);
		System.out.println(isPresent);

	}

	private static boolean nodePresent(BinaryTreeNode<Integer> root, int x) {
		if(root==null)
		return false;
		
		if(root.data==x)
		{
			return true;
		}
		boolean isPresent=false;
		if(x>root.data)
		{
			isPresent= nodePresent(root.right, x);
		}
		if(x<root.data)
		{
			isPresent= nodePresent(root.left, x);
		}
		return isPresent;
	}

}
