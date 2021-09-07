package BST;

import Implementation.BinaryTreeNode;

public class DelPair {
	BinaryTreeNode<Integer> root;
	boolean isPresent;
	
	public DelPair(BinaryTreeNode<Integer> root, boolean isPresent) {
		this.isPresent=isPresent;
		this.root=root;
	}
}
