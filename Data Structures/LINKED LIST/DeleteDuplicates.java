
public class DeleteDuplicates {

	public static void main(String[] args) {
		Node<Integer> head = LinkedListUse.takingInput();
		head= deleteDuplicates(head);
		LinkedListUse.printLinkedList(head);

	}
	
	public static Node<Integer> deleteDuplicates(Node<Integer> head)
	{
		Node<Integer> prev=null,current=head;
		if(head==null)
		{
			return head;
		}
		while(current!=null)
		{
			if(current==head)
			{
				prev=current;
				current=current.next;
				continue;
			}
			if(current.data==prev.data)
			{
				prev.next=current.next;
			}
			else
			{
				prev=current;
			}
			current=current.next;
		}
		return head;
		
	}

}
