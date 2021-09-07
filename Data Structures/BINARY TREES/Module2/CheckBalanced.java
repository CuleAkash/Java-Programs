package Module2;

import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;
import Implementation.HeightOfBinaryTree;

public class CheckBalanced {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		System.out.println(isBalanced(root));

	}

	private static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null)
		return true;
		
		if(isBalanced(root.left) && isBalanced(root.right))
		{
			if(Math.abs(HeightOfBinaryTree.findHeight(root.left)-HeightOfBinaryTree.findHeight(root.right))<=1)
			{
				return true;
			}
		}
		return false;
	}

}
