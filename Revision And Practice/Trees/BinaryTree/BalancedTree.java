package Trees.BinaryTree;

public class BalancedTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        boolean isBalanced= checkBalanced(root);
         isBalanced=checkBalancedBetter(root);
        System.out.println(isBalanced);
    }



    private static boolean checkBalancedBetter(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }
        BalancedTreeReturn ans= helper(root);
        return ans.isBalanced;
    }



    private static BalancedTreeReturn helper(BinaryTreeNode<Integer> root) {
        if(root==null){
            int height=0;
            boolean isBalanced=true;
            return new BalancedTreeReturn(height, isBalanced);
        }

        BalancedTreeReturn left= helper(root.left);
        BalancedTreeReturn right= helper(root.right);

        int height= 1+Math.max(left.height, right.height);
        boolean isBalanced=true;
        if(Math.abs(left.height-right.height)>1){
            isBalanced=false;
        }
        else{
            isBalanced= left.isBalanced && right.isBalanced;
        }
        return new BalancedTreeReturn(height, isBalanced);


    }



    private static boolean checkBalanced(BinaryTreeNode<Integer> root) {
        if(root==null){
            return true;
        }

        int leftHeight= TreeHeight.getHeight(root.left);
        int rightHeight= TreeHeight.getHeight(root.right);
        if(Math.abs(leftHeight-rightHeight)>1){
            return false;
        }

        return checkBalanced(root.left) && checkBalanced(root.right);
    }
}

class BalancedTreeReturn{
    int height;
    boolean isBalanced;
    BalancedTreeReturn(int h,boolean ib){
        height=h;
        isBalanced=ib;
    }
}
