import java.util.Scanner;

public class InsertNode {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		Scanner s = new Scanner(System.in);
		int num= s.nextInt();
		int pos= s.nextInt();
		insertNode(head,num,pos);
		LinkedListUse.printLinkedList(head);

	}
	
	public static void insertNode(Node<Integer> head, int num, int pos)
	{
		Node<Integer> temp= head;
		int count=0;
		while(temp!=null && count<pos-1)
		{
			temp=temp.next;
			count++;
		}
		if(temp!=null)
		{
			Node<Integer> node= new Node<>(num);
			node.next=temp.next;
			temp.next=node;
		}
	}

}
