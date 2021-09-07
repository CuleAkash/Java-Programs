package BST;

import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class SortedArrayToBST {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] input= new int[size];
		for(int i=0;i<size;i++)
		{
			input[i]=s.nextInt();
		}
		BinaryTreeNode<Integer> root= sortedArrayToBST(input);
		BinaryTreeUse.printTree(root);

	}

	private static BinaryTreeNode<Integer> sortedArrayToBST(int[] input) {
		
		return BstHelper(input,0,input.length-1);
	}

	private static BinaryTreeNode<Integer> BstHelper(int[] input, int i, int j) {
		if(i>j)
		return null;
		
		int mid= (i+j)/2;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(input[mid]);
		root.left= BstHelper(input, i, mid-1);
		root.right= BstHelper(input, mid+1, j);
		return root;
	}
	

}
