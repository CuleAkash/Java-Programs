package Implementation;

import java.util.Scanner;

public class HeightOfBinaryTree {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		int height= findHeight(root);
		System.out.println(height);

	}
	
	public static int findHeight(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		return 1+ Math.max(findHeight(root.left),findHeight(root.right));
	}

}
