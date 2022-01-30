package Trees.BinaryTree;

import java.util.Scanner;

public class NodesGreaterThanX {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        int x=s.nextInt();
        int countNodes= getNodesGreaterThanX(root,x);
        System.out.println(countNodes);
        s.close();
    }

    private static int getNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if(root==null){
            return 0;
        }

        if(root.data>x){
            return 1+getNodesGreaterThanX(root.left, x)+getNodesGreaterThanX(root.right, x);
        }
        return getNodesGreaterThanX(root.left, x)+getNodesGreaterThanX(root.right, x);
    }
}
