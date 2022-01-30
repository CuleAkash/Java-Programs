package Trees.BinaryTree;

import java.util.Scanner;

public class CountLeafNodes {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        int countLeaf= countLeafNodes(root);
        System.out.println(countLeaf);
        s.close();
    }

    private static int countLeafNodes(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        return countLeafNodes(root.left)+countLeafNodes(root.right);
    }
}
