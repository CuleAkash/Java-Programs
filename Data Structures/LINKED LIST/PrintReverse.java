
public class PrintReverse {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		printReverse(head);

	}

	public static void printReverse(Node<Integer> head)
	{
		if(head==null)
		{
			return;
		}
		printReverse(head.next);
		System.out.print(head.data+" ");
	}
}
