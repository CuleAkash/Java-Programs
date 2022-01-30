package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTreeSum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        int sum= findSum(root);
        System.out.println(sum);
        s.close();
    }

    private static int findSum(BinaryTreeNode<Integer> root) {
        if(root==null){
            return 0;
        }
        return root.data+findSum(root.left)+findSum(root.right);
    }
}
