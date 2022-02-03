package LinkedList;

import java.util.Scanner;

public class AppendNnodestoFirst {
    public static void main(String[] args) {
        LinkedListNode<Integer> head= LinkedList.createLinkedList();
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        head=function(head,n);
        LinkedList.printLinkedList(head);
        s.close();
    }

    private static LinkedListNode<Integer> function(LinkedListNode<Integer> head, int n) {
        if(head==null)
        return head;

        LinkedListNode<Integer> start= head;
        LinkedListNode<Integer> end= head;
        LinkedListNode<Integer> prev=null;

        for(int i=0;i<n;i++){
            if(end==null)
            return head;
            end=end.next;
        }

        if(end==null)
        return head;

        while(end.next!=null){
            start=start.next;
            end=end.next;
        }
        prev=start;
        start=start.next;

        prev.next=null;
        end.next=head;
        head=start;
        return head;
    }
}
