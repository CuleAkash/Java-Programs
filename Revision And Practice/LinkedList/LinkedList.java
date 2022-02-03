package LinkedList;

import java.util.Scanner;

 class LinkedListNode<T> {
    LinkedListNode<T> next;
    T data;

    public LinkedListNode(T d){
        data=d;
    }
}


class LinkedList{
    public static void main(String[] args) {
        LinkedListNode<Integer> head= createLinkedList();
        printLinkedList(head);

        
    }
    public static void printLinkedList(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            // System.out.print(temp+" "+temp.next);
            // System.out.println();
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static LinkedListNode<Integer> createLinkedList(){
        Scanner s= new Scanner(System.in);
        LinkedListNode<Integer> head= null;
        LinkedListNode<Integer> temp=null;

        int n=s.nextInt();
        while(n!=-1){
            LinkedListNode<Integer> newNode= new LinkedListNode<Integer>(n);
            if(head==null){
                head=newNode;
                temp=head;
            }
            else{
                temp.next=newNode;
                temp=temp.next;
            }
            n=s.nextInt();
        }
        return head;
    }

    
}


