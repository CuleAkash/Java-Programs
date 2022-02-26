package Trees.BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import Trees.BinaryTree.BinaryTree;
import Trees.BinaryTree.BinaryTreeNode;

public class LevelWiseLinkedList {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root= BinaryTree.takingTreeInput();
        ArrayList<Node> ans= getLevelWise(root);
        
        for(Node temp:ans){
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    private static ArrayList<Node> getLevelWise(BinaryTreeNode<Integer> root) {
        ArrayList<Node> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }

        Queue<BinaryTreeNode<Integer>> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size= q.size();
            Node head=null;
            Node tail=null;
            while(size>0){
                BinaryTreeNode<Integer> front= q.poll();
                Node newNode= new Node(front.data, null);
                if(head==null){
                    head=newNode;
                    tail=newNode;
                }
                else{
                    tail.next= newNode;
                    tail=tail.next;
                }

                if(front.left!=null)
                q.add(front.left);

                if(front.right!=null)
                q.add(front.right);

                size--;
            }
            ans.add(head);  
        }
        return ans;

    }
}

class Node{
    int data;
    Node next;

    Node(int d,Node n){
        data=d;
        next=n;
    }
}
