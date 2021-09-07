package Module2;

import java.util.Currency;
import java.util.Scanner;
import java.util.Stack;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class InsertDuplicatesToLeft {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		root= insertDupToLeft(root);
		BinaryTreeUse.printTree(root);

	}

	public static BinaryTreeNode<Integer> insertDupToLeft(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return null;
		}
		
		Stack<BinaryTreeNode<Integer>> pendingNodes= new Stack<>(); 
		BinaryTreeNode<Integer> current= root;
		
		while(!pendingNodes.isEmpty() || current!=null)
		{
			while(current!=null)
			{
				pendingNodes.push(current);
				BinaryTreeNode<Integer> temp= current.left;
				current.left= new BinaryTreeNode<Integer>(current.data);
				current=current.left;
				current.left=temp;
				current=current.left;
			}
			BinaryTreeNode<Integer> front= pendingNodes.pop();
			current=front.right;
		}
		
		return root;
		
	}
}
