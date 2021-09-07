
public class MergeTwoSortedLL {

	public static void main(String[] args) {
		Node<Integer> head1= LinkedListUse.takingInput();
		Node<Integer> head2= LinkedListUse.takingInput();
		Node<Integer> head= merge(head1,head2);
		LinkedListUse.printLinkedList(head);

	}
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2)
	{
		if(head1==null)
		{
			return head2;
		}
		else if(head2==null)
		{
			return head1;
		}
		
		Node<Integer> fast1= head1,slow1=null,fast2=head2,slow2=null;
		while(fast1!=null && fast2!=null)
		{
			if(fast1.data<=fast2.data)
			{
				slow1=fast1;
				fast1=fast1.next;
				if(fast2.data<fast1.data && fast1!=null)
				slow1.next=fast2;
				else fast1=fast1.next;
			}
			else
			{
				slow2=fast2;
				fast2=fast2.next;
				if(fast1.data<fast2.data && fast2!=null)
				slow2.next=fast1;
				else fast2=fast2.next;
			}
		}
		return (head1.data<=head2.data?head1:head2);
		
	}

}
