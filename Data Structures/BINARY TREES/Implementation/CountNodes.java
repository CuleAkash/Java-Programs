package Implementation;

import java.util.Scanner;

public class CountNodes {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		int count= countNodes(root);
		int sum= sumNodes(root);
		System.out.println(count);
		System.out.println(sum);
	}


	
	public static int countNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int count=0;
		count++;
		count+=countNodes(root.left);
		count+=countNodes(root.right);
		return count;
	}
	
	public static int sumNodes(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return 0;
		}
		
		int sum=0;
		sum+=sumNodes(root.left);
		sum+=sumNodes(root.right);
		return root.data+sum;
	}
	
	
}
	


