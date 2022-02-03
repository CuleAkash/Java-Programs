package LinkedList;

public class LengthOfLL {
    public static void main(String[] args) {
        LinkedListNode<Integer> head= LinkedList.createLinkedList();
        int count= countNodes(head);
        System.out.println(count);
    }

    private static int countNodes(LinkedListNode<Integer> head) {
        if(head==null){
            return 0;
        }
        LinkedListNode<Integer> temp= head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
}
