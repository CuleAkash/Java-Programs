package Trees.BST;

import java.util.Arrays;
import java.util.Scanner;

import Trees.BinaryTree.BinaryTree;
import Trees.BinaryTree.BinaryTreeNode;

public class ConvertSortedArrToBST {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        BinaryTreeNode<Integer> root= constructTree(arr,0,n-1);
        BinaryTree.printBinaryTree(root);
        s.close();
    }

    private static BinaryTreeNode<Integer> constructTree(int[] arr, int start, int end) {
        if(start>end)
        return null;

        int mid= (end-start)/2 + start;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
        root.left= constructTree(arr, start, mid-1);
        root.right= constructTree(arr, mid+1, end);

        return root;
    }
}
