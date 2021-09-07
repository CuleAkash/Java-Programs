package BST;

import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class PrintBetweenIntervals {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		Scanner s= new Scanner(System.in);
		int k1= s.nextInt();
		int k2= s.nextInt();
		printBetweenK1K2(root,k1,k2);

	}

	private static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root==null)
			return;
		if(root.data<k1)
		{
			printBetweenK1K2(root.right, k1, k2);
		}
		if(root.data>k2)
		{
			printBetweenK1K2(root.left, k1, k2);
		}
		if(root.data>=k1 && root.data<=k2)
		{
			System.out.print(root.data+" ");
			printBetweenK1K2(root.left, k1, k2);
			printBetweenK1K2(root.right, k1, k2);
		}
		
	}

}
