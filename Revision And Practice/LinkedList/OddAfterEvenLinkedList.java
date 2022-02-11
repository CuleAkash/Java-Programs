package LinkedList;

public class OddAfterEvenLinkedList {
   public static void main(String[] args) {
       LinkedListNode<Integer> head= LinkedList.createLinkedList();
       head= function(head);
       LinkedList.printLinkedList(head);
   }

private static LinkedListNode<Integer> function(LinkedListNode<Integer> head) {
    if(head==null)
    return head;

    LinkedListNode<Integer> evenHead=null,evenTail=null,oddHead=null,oddTail=null;
    while(head!=null){
        if(head.data%2==0){
            if(evenHead==null){
                evenHead=head;
                evenTail=head;
            }
            else{
                evenTail.next=head;
                evenTail=evenTail.next;
            }
        }
        else{
            if(oddHead==null){
                oddHead=head;
                oddTail=head;
            }
            else{
                oddTail.next=head;
                oddTail=oddTail.next;
            }
        }
        head=head.next;
    }

    if(oddHead==null)
    return evenHead;//if odd LL is empty

    oddTail.next=evenHead;
    if(evenHead!=null)//if even LL is not null it tail must point to null
    evenTail.next=null;
    return oddHead;
} 
}
