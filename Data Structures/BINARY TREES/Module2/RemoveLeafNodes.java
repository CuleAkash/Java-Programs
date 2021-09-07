package Module2;

import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class RemoveLeafNodes {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		root= removeLeaves(root);
		BinaryTreeUse.printTree(root);

	}

	private static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if(root==null) {
		return null;
		}
		if(root.left==null && root.right==null)
		{
			return null;
		}
		
		root.left=removeLeaves(root.left);
		root.right=removeLeaves(root.right);
		return root;
	}
	
}
