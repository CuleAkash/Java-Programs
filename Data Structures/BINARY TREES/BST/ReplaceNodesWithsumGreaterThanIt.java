package BST;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class ReplaceNodesWithsumGreaterThanIt {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		int sum= replace(root,0);
		System.out.println(sum);
		BinaryTreeUse.printTree(root);

	}

	private static int replace(BinaryTreeNode<Integer> root, int sum) {
		if(root==null)
		{
			return sum;
		}
		int rightSum= replace(root.right, sum);
		sum=rightSum+root.data;
		root.data=sum;
		int leftSum= replace(root.left,sum);
		return leftSum;
		
	}

}
