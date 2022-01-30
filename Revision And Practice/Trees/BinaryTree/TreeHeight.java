package Trees.BinaryTree;

import java.util.Scanner;

public class TreeHeight {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        int height= getHeight(root);
        System.out.println(height);
        s.close();
    }

    private static int getHeight(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }

        return 1+Math.max(getHeight(root.left), getHeight(root.right));
    }
}
