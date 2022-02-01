package Trees.BinaryTree;

import java.util.Scanner;

public class TreeUsingPreorderAndInorder {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int in[]= new int[size];
        int pre[]=new int[size];

        for(int i=0;i<size;i++){
            in[i]=s.nextInt();
        }

        for(int i=0;i<size;i++){
            pre[i]=s.nextInt();
        }

        BinaryTreeNode<Integer> root= constructTree(in,pre);
        BinaryTree.printBinaryTree(root);
        s.close();

    }

    private static BinaryTreeNode<Integer> constructTree(int[] in, int[] pre) {
        return helper(in,pre,0,in.length-1,0,pre.length-1);
    }

    private static BinaryTreeNode<Integer> helper(int[] in, int[] pre, int startIn, int endIn, int startPre, int endPre) {
        if(startIn>endIn){
            return null;
        }        
        if(startPre>endPre){
            return null;
        }

        int rootData= pre[startPre];
        BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        int i=startIn;
        while(in[i]!=rootData){
            i++;
        }
        int leftTreeLength=i-startIn;
        root.left= helper(in, pre, startIn, i-1, startPre+1, startPre+leftTreeLength);
        root.right= helper(in, pre, i+1, endIn, startPre+leftTreeLength+1,endPre);
        return root;
    }
}
