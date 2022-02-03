package LinkedList;

import java.util.Scanner;

public class InsertNode {
    public static void main(String[] args) {
        LinkedListNode<Integer> head= LinkedList.createLinkedList();
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int pos= s.nextInt();
        head=insertNode(head,n,pos);
        LinkedList.printLinkedList(head);
        s.close();
    }

    private static LinkedListNode<Integer> insertNode(LinkedListNode<Integer> head,int nodeData,int pos) {
        LinkedListNode<Integer> newnode= new LinkedListNode<>(nodeData);
        if(head==null){
            head=newnode;
            return head;
        }
        if(pos==0){
            newnode.next=head;
            head=newnode;
            return head;
        }
        LinkedListNode<Integer> temp=head;
        for(int i=0;i<pos-1;i++){
            if(temp==null)
            return head;
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
}
