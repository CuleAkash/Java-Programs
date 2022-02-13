package Trees.BST;

import Trees.BinaryTree.BinaryTreeNode;

public class BST {
    //This BST will provide the user to implement a BST keeping internal functionalities abstract to the user
    private BinaryTreeNode<Integer> root;
    //Internally it will maintain a root of the BST
    private int size;

    public boolean isPresent(int d){
        //As it is not taking the root of the tree in which we have to search
        // 1. We can do iterative solution
        //2. We use helper function
        return isPresentHelper(this.root,d);
    }

    //This function doesn't depend on the BST object but only depends on the node it is passed, so we can make it a static function
    private static boolean isPresentHelper(BinaryTreeNode<Integer> node, int d) {
        if(node==null)
        return false;

        if(node.data==d)
        return true;

        if(d>node.data)
        return isPresentHelper(node.right, d);
        else
        return isPresentHelper(node.left, d);
    }

    public void insert(int val){
        this.root= insertHelper(this.root,val);
        this.size++;
    }

    private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int val) {
        if(node==null)
        return new BinaryTreeNode<Integer>(val);

        if(node.data<val)
            node.right= insertHelper(node.right, val);

        else if(node.data>val)
        node.left=insertHelper(node.left, val);

        return node;
    }

    public boolean remove(int val){//Delete data if present and return true if not present return false
        Pair ans= removeHelper(this.root,val);
        return ans.deleted;
    }

    private static Pair removeHelper(BinaryTreeNode<Integer> root, int val) {
        //if root is null
        if(root==null)
        return new Pair(null, false);


        if(root.data==val){
            //Three cases

            // 1. if zero children return null
            //2. of one child return that child
            //3. if two children get the minimum from right side and replae value and then delete from right side

            if(root.left==null){
                return new Pair(root.right, true);
            }
            else if(root.right==null){
                return new Pair(root.left, true);
            }
            BinaryTreeNode<Integer> temp= root.right;
            int min= temp.data;
            while(temp.left!=null){
                temp=temp.left;
                min=temp.data;
            }
            root.data=min;
            root.right= removeHelper(root.right, min).node;
            return new Pair(root, true);
        }

        //If the val is greater than the root value it search on the right side

        if(root.data<val){
            Pair rightAns= removeHelper(root.right, val);
            root.right= rightAns.node;
            rightAns.node=root;
            return rightAns;
        }

        else{
            Pair leftAns= removeHelper(root.left, val);
            root.left= leftAns.node;
            leftAns.node=root;
            return leftAns;
        }




    }

    public int size(){
        return this.size;
    }

    public void printTree(){
        printTreeHelper(this.root);
    }

    private static void printTreeHelper(BinaryTreeNode<Integer> node) {
        if(node==null)
        return;

        System.out.print(node.data+":");

        if(node.left!=null)
            System.out.print(" L: "+node.left.data);

        if(node.right!=null)
            System.out.println(" R: "+node.right.data);
        
        System.out.println();

        printTreeHelper(node.left);
        printTreeHelper(node.right);
    }
}

class Pair{
    BinaryTreeNode<Integer> node;
    boolean deleted;

    public Pair(BinaryTreeNode<Integer> n,boolean d){
        node=n;
        deleted=d;
    }
}



class BSTUse{
    public static void main(String[] args) {
        BST bst= new BST();

        bst.insert(2);
        bst.insert(5);
        bst.insert(7);
        bst.insert(10);
        bst.insert(6);
        bst.insert(1);
        bst.insert(0);
        bst.insert(4);
        bst.insert(3);

        bst.printTree();
        System.out.println(bst.isPresent(5));
        bst.remove(5);
        System.out.println(bst.isPresent(5));

        bst.printTree();
    }
}
