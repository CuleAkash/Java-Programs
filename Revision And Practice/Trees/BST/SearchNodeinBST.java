package Trees.BST;

import java.util.Scanner;

import Trees.BinaryTree.BinaryTree;
import Trees.BinaryTree.BinaryTreeNode;

public class SearchNodeinBST {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        int val= s.nextInt();
        boolean isPresent= searchNode(root,val);
        System.out.println(isPresent);
        s.close();

    }

    private static boolean searchNode(BinaryTreeNode<Integer> root, int val) {
        if(root==null)
        return false;

        if(root.data==val)
        return true;

        if(val<root.data)
        return searchNode(root.left, val);
        
        return searchNode(root.right, val);

    }
}
