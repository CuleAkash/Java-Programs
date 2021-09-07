
public class ReverseOfLinkedList {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		head= reverseList(head);
		LinkedListUse.printLinkedList(head);

	}
	
	public static Node<Integer> reverseList(Node<Integer> head)
	{
		Node<Integer> prev=null,current=head,nextnode=head.next;
		
		while(nextnode!=null)
		{
			if(current==head)
			{
				current.next=null;
				
			}
			else
			{
				current.next=prev;
				
			}
			prev=current;
			current=nextnode;
			nextnode=nextnode.next;
		}
		current.next=prev;
		head=current;
		return head;
	}

}
