package Trees.BinaryTree;

public class HeightOfTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        int diameter= diameterTree(root);
        System.out.println(diameter);
    }

    private static int diameterTree(BinaryTreeNode<Integer> root) {
        DiameterReturn ans= helper(root);
        return ans.diameter;
    }

    private static DiameterReturn helper(BinaryTreeNode<Integer> root) {
        if(root==null){
            return new DiameterReturn(0, 0);
        }

        DiameterReturn leftAns= helper(root.left);
        DiameterReturn rightAns= helper(root.right);

        int dist= leftAns.height+rightAns.height;
        int diameter= Math.max(leftAns.diameter, Math.max(rightAns.diameter, dist));
        int height= 1+Math.max(leftAns.height, rightAns.height);
        return new DiameterReturn(height, diameter);
    }
}

class DiameterReturn{
    int height;
    int diameter;
    DiameterReturn(int h,int d){
        height=h;
        diameter=d;
    }
}
