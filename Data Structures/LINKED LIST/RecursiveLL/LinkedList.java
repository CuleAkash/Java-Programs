package RecursiveLL;

import java.util.Scanner;

public class LinkedList {
	
	public static Node<Integer> createList()
	{
		Node<Integer> head=null,tail=null;
		Scanner s= new Scanner(System.in);
		int data= s.nextInt();
		while(data!=-1)
		{	Node<Integer> newnode= new Node<>(data);
			if(head==null)
			{
				head=newnode;
				tail=head;
			}
			else
			{
				tail.next=newnode;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static void printList(Node<Integer> head)
	{
		Node<Integer> temp=head;
		if(head==null)
		{
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static int getLength(Node<Integer> head)
	{
		int count=0;
		if(head==null)
			{
				return 0;
			}
		Node<Integer> temp= head;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}

}
