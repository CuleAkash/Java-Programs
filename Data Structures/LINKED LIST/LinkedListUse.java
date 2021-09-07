import java.util.Scanner;

public class LinkedListUse {

	public static void main(String[] args) {
	//	Node<Integer> head= createLinkedList();
		//printLinkedList(head);
		Node<Integer> head= takingInput();
		System.out.println(length(head));
		printLinkedList(head);
		findElement(4,head);

	}
	
	public static Node<Integer> takingInput()//(optimized solution)
	{
		Scanner s = new Scanner(System.in);
		Node<Integer> head= null, tail=null;//taking a pointer tail which will point always to the last node
		int data= s.nextInt();
		while(data!=-1)
		{	Node<Integer> currentNode= new Node<>(data);
			if(head==null)
			{
				head=currentNode;
				tail=head;
			}
			else
			{
				tail.next=currentNode;
				tail= tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	
	public static Node<Integer> takingINput()
	{
		Scanner s= new Scanner(System.in);
		Node<Integer> head=null;//initialisng the head pointer
		int data=s.nextInt();// taling the first data
		while(data!=-1)// we will be taking input until the dta given by user is -1
		{
			Node<Integer> currentNode= new Node<>(data);// creating a new node if data is not -1
			if(head==null)// if the head is null then it has to be the first element
			{
				head=currentNode;
			}
			else {
				Node<Integer> temp= head;// if not first element we have to traverse to the end of the current linked list to insert the next node into the current linked list
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=currentNode;// when we reach the end of the linked list we assign the new node
			}
			data=s.nextInt();// taling next data to check whether its -1 or not
		}
		return head;
	}// this method of taking input is of order O(n^2) 
	
	public static void findElement(int i,Node<Integer> head)
	{
		Node<Integer> temp= head;
		int count=-1;
		while(temp!=null)
		{
			count++;
			if(count==i)
			{
				System.out.print(temp.data);
				return;
			}
			temp=temp.next;
		}
		
	}
	
	
//	public static Node<Integer> createLinkedList()// to create a linked list and return its head reference
//	{
//		Node<Integer> n1= new Node<>(10);// creating the first node
//		Node<Integer> n2= new Node<>(20);
//		Node<Integer> n3= new Node<>(30);
//		n1.next= n2;// storing the second node reference int the first node next parameter
//		n2.next=n3;
//		return n1;// returning the head reference
//		
//	}
	
	public static void printLinkedList(Node<Integer> head)
	{
		Node<Integer> temp= head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static int length(Node<Integer> head) // to find the length of the linked list
	{
		Node<Integer> temp= head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		return count;
	}

}
