package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
public static void main(String[] args) {
    BinaryTreeNode<Integer> root= takingTreeInput();
    printBInaryTree(root);
}   


public static BinaryTreeNode<Integer> takingTreeInput() {
    // Scanner s= new Scanner(System.in);
    // if(isRoot)
    // System.out.print("Enter root data: ");
    // else{
    //     if(isLeft){
    //         System.out.print("Enter left child of "+parentData+": ");
    //     }
    //     else{
    //         System.out.print("Enter right child of "+parentData+": ");
    //     }
    // }
    // int rootData=s.nextInt();

    // //if -1 root is null
    // if(rootData==-1){
    //     s.close();
    //     return null;
    // }

    // BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
    // BinaryTreeNode<Integer> leftChild= takingTreeInput(false,rootData,true);
    // BinaryTreeNode<Integer> rightChild= takingTreeInput(false,rootData,false);

    // root.left=leftChild;
    // root.right=rightChild;

    // s.close();
    // return root;

    Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		if(num==-1)
		{
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(num);
		System.out.println("Enter the left child of "+root.data );
		root.left=takingTreeInput();
		System.out.println("Enter the right child of "+root.data );
		root.right=takingTreeInput();
		return root;
}


public static void printBInaryTree(BinaryTreeNode<Integer> root){
    if(root==null){
        return;
    }

    System.out.print(root.data+": ");
    if(root.left!=null){
        System.out.print("L:"+root.left.data+" ");
    }
    if(root.right!=null){
        System.out.print("R:"+root.right.data);
    }
    System.out.println();

    printBInaryTree(root.left);
    printBInaryTree(root.right);
}
}
