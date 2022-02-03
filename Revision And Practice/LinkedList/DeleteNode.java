package LinkedList;

import java.util.Scanner;

public class DeleteNode {
   public static void main(String[] args) {
       LinkedListNode<Integer> head= LinkedList.createLinkedList();
       Scanner s= new Scanner(System.in);
       int pos= s.nextInt();
       head= deleteNode(head,pos);
       LinkedList.printLinkedList(head);
       s.close();
   }

private static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
    if(head==null){
        return head;
    }

    if(pos==0){
        return head.next;
    }

    LinkedListNode<Integer> slow=null;
    LinkedListNode<Integer> fast= head;

    for(int i=0;i<pos && fast!=null;i++){
        slow=fast;
        fast=fast.next;
    }

    if(fast==null){
        return head;
    }

    slow.next=fast.next;
    fast.next=null;
    return head;
} 
}
