package BST;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;

public class CheckBST {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		boolean isBST= isBSTbetter(root);
		System.out.println(isBST);

	}

	private static boolean checkBST(BinaryTreeNode<Integer> root) {
		if(root==null) {
		return true;
		}// if root is null then it is a bst
		
		int leftMax= maximum(root.left);//for a tree to be bst all the nodes to the left of the root must be less than the root data
		if(leftMax>=root.data)// if the maximum of the left subtree is greater than the root data then it is not bst
		{
			return false;
		}
		
		int rightMin= minimum(root.right);//for a tree to be bst all the nodes to the right of the root must be greater than the root data
		if(rightMin<root.data)// if the minimum of the right subtree is less than the root data then it is not bst
		{
			return false;
		}
		
		boolean isleftBST= checkBST(root.left);
		boolean isRightBST= checkBST(root.right);
		return isleftBST && isRightBST;
		
		
	}

	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		int leftMin= minimum(root.left);
		int rightMin= minimum(root.right);
		return Math.min(root.data, Math.min(leftMin, rightMin));
	}

	private static int maximum(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		int leftMax= maximum(root.left);
		int rightMax= maximum(root.right);
		return Math.max(root.data, Math.max(leftMax, rightMax));
	}
	
	//alternative and better approach
	
	public static boolean isBSTbetter(BinaryTreeNode<Integer> root)
	{
		Triplet ans= BSTchecker(root);
		return ans.isBST;
	}

	private static Triplet BSTchecker(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			Triplet ans= new Triplet();
			int maximum= Integer.MIN_VALUE;
			int minimum= Integer.MAX_VALUE;
			boolean isBST= true;
			ans.maximum=maximum;
			ans.minimum=minimum;
			ans.isBST=isBST;
			return ans;
		}
		
		Triplet left= BSTchecker(root.left);
		Triplet right= BSTchecker(root.right);
		
		int maximum= Math.max(root.data, Math.max(left.maximum, right.maximum));
		int minimum= Math.min(root.data, Math.min(left.minimum,right.minimum));
		
		boolean isBST= true;
		
		if(left.maximum>=root.data)
		{
			isBST=false;
		}
		if(right.minimum<root.data)
		{
			isBST=false;
		}
		
		if(!left.isBST || !right.isBST)
		{
			isBST=false;
		}
		
		Triplet ans= new Triplet();
		ans.maximum=maximum;
		ans.minimum=minimum;
		ans.isBST=isBST;
		return ans;
		
	}

}

