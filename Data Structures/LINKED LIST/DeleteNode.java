import java.util.Scanner;

public class DeleteNode {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		Scanner s= new Scanner(System.in);
		int pos= s.nextInt();
		head=deleteNode(pos,head);
		LinkedListUse.printLinkedList(head);

	}
	
	public static Node<Integer> deleteNode(int pos, Node<Integer> head)
	{
		Node<Integer> current= head;
		Node<Integer> prev= null;
		int i=0;
		if(pos==0)
		{
			head=head.next;
			return head;
		}
		while(current!=null && i<pos)
		{
			prev=current;
			current= current.next;
			i++;	
		}
		
		if(current!=null)
		{
			prev.next=current.next;
			current.next=null;
		}
		return head;
	}

}
