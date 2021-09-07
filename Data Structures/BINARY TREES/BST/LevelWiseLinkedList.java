package BST;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

import Implementation.BinaryTreeNode;
import Implementation.BinaryTreeUse;
import RecursiveLL.LinkedList;
import RecursiveLL.Node;

public class LevelWiseLinkedList {

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		Scanner s= new Scanner(System.in);
		ArrayList<Node<Integer>> ans= returnBTtoLL(root);
		for(Node<Integer> i: ans) {
			LinkedList.printList(i);
			System.out.println();
		}

	}

	private static ArrayList<Node<Integer>> returnBTtoLL(BinaryTreeNode<Integer> root) {
		ArrayList<Node<Integer>> ans= new ArrayList<>();
		if(root==null) {
			return ans;
		}
		Queue<BinaryTreeNode<Integer>> q= new java.util.LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node<Integer> head=null;
			Node<Integer> tail=null;
			int size= q.size();
			for(int i=0;i<size;i++) {
				BinaryTreeNode<Integer> temp=q.poll();
				Node<Integer> newnode= new Node<>(temp.data);
				newnode.next=null;
				if(head==null) {
					head=newnode;
					tail=newnode;
				}
				else {
					tail.next=newnode;
					tail=tail.next;
				}
				
				if(temp.left!=null) {
					q.add(temp.left);
				}
				if(temp.right!=null) {
					q.add(temp.right);
				}
			}
			ans.add(head);
		}
		return ans;
	}

}
