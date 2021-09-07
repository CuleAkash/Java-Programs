package CircularLL;

import java.util.Scanner;

public class CircularLinkedList {

	public static void main(String[] args) {
		Node tail= createCLL();
		System.out.println(tail.next.data);

	}
	
	public static Node createCLL()
	{
		Scanner s= new Scanner(System.in);
		int data= s.nextInt();
		Node tail= null;
		while(data!=-1)
		{
			Node newnode= new Node(data);
			if(tail==null)
			{
				tail=newnode;
				tail.next=newnode;
			}
			else
			{
				newnode.next=tail.next;
				tail.next=newnode;
				tail=newnode;	
			}
			data=s.nextInt();
		}
		return tail;
	}

}
