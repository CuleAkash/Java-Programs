package Implementation;

import java.util.Scanner;

public class LargestNode {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		int largest= findLargestNode(root);
		System.out.println(largest);

	}
	
	public static int findLargestNode(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		
		int largest=root.data;
		int leftLargest= findLargestNode(root.left);
		if(leftLargest>largest)
		{
			largest=leftLargest;
		}
		int rightLargest= findLargestNode(root.right);
		if(rightLargest>largest)
		{
			largest=rightLargest;
		}
		return largest;
	}

}
