package RecursiveLL;



public class ReverseR {

	public static void main(String[] args) {
		Node<Integer> head= LinkedList.createList();
		head= reverseR(head);
		LinkedList.printList(head);
	}

	public static Node<Integer> reverseR(Node<Integer> head)
	{
		if(head== null)
		{
			return head;
		}
		if(head.next==null)
		{
			return head;
		}
		Node<Integer> smallhead= reverseR(head.next);
		head.next.next=head;
		head.next=null;
		return smallhead;
	}
}
