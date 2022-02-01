package Trees.BinaryTree;

public class MirrorBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        root=mirror(root);
        BinaryTree.printBinaryTree(root);

    }

    private static BinaryTreeNode<Integer> mirror(BinaryTreeNode<Integer> root) {
        if(root==null){
            return null;
        }

        if(root.left==null && root.right==null){
            return root;
        }

        BinaryTreeNode<Integer> temp=root.left;
        root.left= mirror(root.right);
        root.right=mirror(temp);
        return root;
    }
}
