package Trees.BinaryTree;

import java.util.Scanner;

public class TreeUsingInorderAndPostorder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int in[]= new int[size];
        int post[]=new int[size];

        for(int i=0;i<size;i++){
            in[i]=s.nextInt();
        }

        for(int i=0;i<size;i++){
            post[i]=s.nextInt();
        }

        BinaryTreeNode<Integer> root= constructTree(in,post);
        BinaryTree.printBinaryTree(root);
        s.close();
    }

    private static BinaryTreeNode<Integer> constructTree(int[] in, int[] post) {
        return helper(in,post,0,in.length-1,0,post.length-1);
    }

    private static BinaryTreeNode<Integer> helper(int[] in, int[] post, int startIn, int endIn, int startPost, int endPost) {
        if(startIn>endIn || startPost>endPost){
            return null;
        }

        int rootData= post[endPost];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        int i=0;
        while(in[i]!=rootData){
            i++;
        }
        int leftTreeLength= i-startIn;
        root.left= helper(in, post, startIn, startIn+leftTreeLength, startPost, startPost+leftTreeLength-1);
        root.right=helper(in, post, i+1, endIn, startPost+leftTreeLength, endPost-1);
        return root;
    }
}
