package BST;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;
import RecursiveLL.LinkedList;
import RecursiveLL.Node;

public class BSTtoLL {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		Node<Integer> head= BSTtoLL(root);
		LinkedList.printList(head);
		

	}

	private static Node<Integer> BSTtoLL(BinaryTreeNode<Integer> root) {
		LinkedListReturn ans= helper(root);
		return ans.head;
	}

	private static LinkedListReturn helper(BinaryTreeNode<Integer> root) {
		if(root==null)
		{
			LinkedListReturn ans= new LinkedListReturn();
			ans.head=null;
			ans.tail=null;
			return ans;
		}
		
		LinkedListReturn leftAns= helper(root.left);
		
		Node<Integer> head= leftAns.head;
		Node<Integer> tail= leftAns.tail;
		Node<Integer> newnode= new Node<>(root.data);
		newnode.next=null;
		if(head==null)
		{
			head=tail=newnode;
		}
		else {
			tail.next=newnode;
			tail=tail.next;
		}
		
		LinkedListReturn rightAns= helper(root.right);
		if(rightAns.head!=null)
		{
			tail.next=rightAns.head;
			tail=rightAns.tail;
		}
		
		LinkedListReturn ans= new LinkedListReturn();
		ans.head=head;
		ans.tail=tail;
		return ans;
		
	}

}
