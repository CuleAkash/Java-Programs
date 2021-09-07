package RecursiveLL;

import java.util.Scanner;

public class DeleteR {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int pos= s.nextInt();
		Node<Integer> head= LinkedList.createList();
		head= deleteR(head,pos);
		LinkedList.printList(head);

	}

	
	public static Node<Integer> deleteR(Node<Integer> head, int pos)
	{
		if(head==null || pos>=LinkedList.getLength(head))
		{
			return head;
		}
		
		if(pos==0)
		{
			head= head.next;
			return head;
		}
		
		Node<Integer> smallhead= deleteR( head.next,  pos-1);
		head.next=smallhead;
		return head;
	}
}
