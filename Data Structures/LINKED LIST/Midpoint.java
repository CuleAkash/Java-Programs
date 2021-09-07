
public class Midpoint {

	public static void main(String[] args) {
		
	Node<Integer> head= LinkedListUse.takingInput();
	int mid= findingMidPoint(head);
	System.out.println(mid);

	}
	
	public static int findingMidPoint(Node<Integer> head)
	{
		Node<Integer> fast= head;
		Node<Integer> slow= head;
		if(head==null)
		{
			return 0;
		}
		
		while(fast.next!=null)
		{
			fast=fast.next.next;
			if(fast==null)
			{
				return slow.data;
			}
			slow=slow.next;
		}
		return slow.data;
	}

}
