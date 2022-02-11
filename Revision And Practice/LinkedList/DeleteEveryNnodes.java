package LinkedList;

import java.util.Scanner;

public class DeleteEveryNnodes {
    public static void main(String[] args) {
        LinkedListNode<Integer> head= LinkedList.createLinkedList();
        Scanner s= new Scanner(System.in);
        int m= s.nextInt();
        int n= s.nextInt();
        head=function(head,m,n);
        LinkedList.printLinkedList(head);
        s.close();
    }

    private static LinkedListNode<Integer> function(LinkedListNode<Integer> head, int m, int n) {
        if(head==null){
            return head;
        }

        LinkedListNode<Integer> newHead=null,newTail=null;
        while(head!=null){
            int count=m;
            while(count>0 && head!=null){
                if(newHead==null){
                    newHead=head;
                    newTail=head;
                }
                else{
                    newTail.next=head;
                    newTail=newTail.next;
                }
                count--;
                head=head.next;
            }

            count=n;
            while(count>0 && head!=null){
                head=head.next;
                count--;
            }
        }

        if(newHead==null){
            return newHead;
        }

        newTail.next=null;
        return newHead;
    }
}
