package RecursiveLL;

import java.util.Scanner;

public class InsertR {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int pos=s.nextInt();
		int num= s.nextInt();
		Node<Integer> head= LinkedList.createList();
		head= insertionR(head,num,pos);
		LinkedList.printList(head);
	}
	
	public static Node<Integer> insertionR(Node<Integer> head, int num, int pos)
	{
		if(head==null || pos>=LinkedList.getLength(head))
		{
			return head;
		}
		if(pos==0)
		{
			Node<Integer> newnode= new Node<>(num);
			newnode.next=head;
			head= newnode;
			return head;
		}
		Node<Integer> smallhead= insertionR(head.next,num,pos-1);
		head.next=smallhead;
		return head;
		
		
	}

}
