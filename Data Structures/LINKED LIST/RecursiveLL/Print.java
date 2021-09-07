package RecursiveLL;

public class Print {

	public static void main(String[] args) {
		Node<Integer> head= LinkedList.createList();
		printList(head);
	}
	
	public static void printList(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		System.out.print(head.data+" ");
		printList(head.next);
	}

}
