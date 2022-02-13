package Trees.BST;

import Trees.BinaryTree.BinaryTree;
import Trees.BinaryTree.BinaryTreeNode;

public class CheckIsBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        boolean isBST= checkIsBST(root);
        System.out.println(isBST);
    }

    private static boolean checkIsBST(BinaryTreeNode<Integer> root) {
        return helper(root).isBST;
    }

    private static CheckBSTReturn helper(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new CheckBSTReturn(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
        }

        CheckBSTReturn leftAns= helper(root.left);
        CheckBSTReturn rightAns= helper(root.right);

        boolean isBST=true;

        if(root.data<=leftAns.maximum || root.data>rightAns.minimum){
            isBST=false;
        }

        if(!leftAns.isBST || !rightAns.isBST){
            isBST=false;
        }

        int maximum = Math.max(leftAns.maximum,Math.max(rightAns.maximum, root.data));
        int minimum = Math.min(leftAns.minimum,Math.min(rightAns.minimum, root.data));

        return new CheckBSTReturn(maximum, minimum, isBST);
    }
    
}

class CheckBSTReturn{
    int maximum;
    int minimum;
    boolean isBST;

    public CheckBSTReturn(int m1,int m2,boolean b){
        maximum=m1;
        minimum=m2;
        isBST=b;
    }
}
