package Implementation;

public class BinaryTreeNode<E>{
	public E data; // data of the node of the binary tree
	public BinaryTreeNode<E> left; // reference to the left child node of this parent node
	public BinaryTreeNode<E> right; // reference to the right child of this binary tree parent node
	
	public BinaryTreeNode(E data)
	{
		this.data=data;
	} // constructor to construct a new node and initialise its data
	

}
