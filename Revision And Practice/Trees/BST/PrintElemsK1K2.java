package Trees.BST;

import java.util.Scanner;

import Trees.BinaryTree.BinaryTree;
import Trees.BinaryTree.BinaryTreeNode;

public class PrintElemsK1K2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = BinaryTree.takingTreeInput();
        int k1 = s.nextInt();
        int k2 = s.nextInt();
        printNodes(root, k1, k2);
        s.close();
    }

    private static void printNodes(BinaryTreeNode<Integer> root, int k1, int k2) {
        if (root == null)
            return;

        if (root.data >= k1 && root.data <= k2) {
            printNodes(root.left, k1, k2);
            System.out.print(root.data + " ");
            printNodes(root.right, k1, k2);
        } else if (root.data < k1) {
            printNodes(root.right, k1, k2);
        } else if (root.data > k2) {
            printNodes(root.left, k1, k2);
        }
    }
}
