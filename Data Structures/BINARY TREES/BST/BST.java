package BST;

import Implementation.BinaryTreeNode;

public class BST {
	private BinaryTreeNode<Integer> root;
	private int size;
	
	
	//to insert data to BST
	public void insert(int data) {
		root= insertHelper(root,data);//updating the new root
		size++;
	}
	
	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data) {
		if(root==null)
		{
			BinaryTreeNode<Integer> newnode= new BinaryTreeNode<Integer>(data);
			root=newnode;
			return root;
		}
		if(data<root.data) {
			root.left= insertHelper(root.left, data);
		}
		else {
			root.right= insertHelper(root.right, data);
		}
		return root;
	}
	
	

	//isPresent
	public boolean isPresent(int x)
	{
		return isPresentHelper(root,x);
	}
	//function to iterate through the tree
	private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		if(root==null)
		{
			return false;
		}
		if(root.data==x)
		{
			return true;
		}
		
		if(root.data>x)
		{
			return isPresentHelper(root.left, x);
		}
		else {
			return isPresentHelper(root.right, x);
		}
	}

	
	
	//to delete a node
	public boolean deleteData(int x) {
		DelPair ans= deleteDataHelper(root,x);
		if(ans.isPresent) {
			size--;
		}
		root=ans.root;
		return ans.isPresent;
	}
	
	
	private DelPair deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
			return new DelPair(null, false);
		}
		if(root.data<x) {
			DelPair outputRight= deleteDataHelper(root.right, x);
			root.right= outputRight.root;
			outputRight.root=root;
			return outputRight;
		} 
		if(root.data>x) {
			DelPair outputLeft= deleteDataHelper(root.left, x);
			root.left=outputLeft.root;
			outputLeft.root=root;
			return outputLeft;
		}
		if(root.left==null && root.right==null) {
			return new DelPair(null, true);
		}
		if(root.left!=null && root.right==null) {
			return new DelPair(root.left, true);
		}
		if(root.right!=null && root.left==null) {
			return new DelPair(root.right, true);
		}
		int rightMin= minimum(root.right);
		root.data=rightMin;
		DelPair outputRight= deleteDataHelper(root.right, rightMin);
		root.right=outputRight.root;
		return new DelPair(root, true);
		
		
	}

	private int minimum(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		int leftMin= minimum(root.left);
		int rightMin= minimum(root.right);
		return Math.min(leftMin, Math.min(root.data, rightMin));
	}

	public int size()
	{
		return this.size;
	}
	
	
	//printTree function
	
	public void printTree() {
		printTreeHelper(root);
	}

	private static void printTreeHelper(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+": ");
		if(root.left!=null)
		{
			System.out.print("L"+root.left.data+", ");
		}
		if(root.right!=null)
		{
			System.out.print("R"+root.right.data+" ");
		}
		System.out.println();
		printTreeHelper(root.left);
		printTreeHelper(root.right);
		
		
	}
}
