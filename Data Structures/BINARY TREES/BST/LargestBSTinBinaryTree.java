package BST;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class LargestBSTinBinaryTree {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		int largestBSTheight= largestBST(root);
		System.out.println(largestBSTheight);
		

	}

	private static int largestBST(BinaryTreeNode<Integer> root) {
		LargestBSTReturn ans= helperLargestBST(root);
		System.out.println(ans.root.data);
		return ans.height;
		
	}

	private static LargestBSTReturn helperLargestBST(BinaryTreeNode<Integer> root) {
	if(root==null) {
		LargestBSTReturn ans= new LargestBSTReturn();
		ans.height=0;
		ans.isBST=true;
		ans.maximum=Integer.MIN_VALUE;
		ans.minimum=Integer.MAX_VALUE;
		ans.root=null;
		return ans;
	}
	LargestBSTReturn leftOutput= helperLargestBST(root.left);
	LargestBSTReturn rightOutput= helperLargestBST(root.right);
	LargestBSTReturn ans= new LargestBSTReturn();
	ans.isBST=true;
	
	if(leftOutput.maximum>=root.data) {
		ans.isBST=false;
	}
	if(rightOutput.minimum<root.data) {
		ans.isBST=false;
	}
	if(!leftOutput.isBST || !rightOutput.isBST) {
		ans.isBST=false;
	}
	
	if(ans.isBST) {
		ans.height=1+Math.max(leftOutput.height, rightOutput.height);
		ans.root=root;
	}
	else {
		ans.height=Math.max(leftOutput.height, rightOutput.height);
		if(ans.height==leftOutput.height) {
			ans.root=leftOutput.root;
		}
		else {
			ans.root=rightOutput.root;
		}
	}
	
	
	
	
	ans.maximum= Math.max(root.data, Math.max(leftOutput.maximum, rightOutput.maximum));
	ans.minimum=Math.min(root.data, Math.min(leftOutput.minimum, rightOutput.minimum));
	return ans;
	
	
	
	
	
	
	
	
	
	
	
	}

}