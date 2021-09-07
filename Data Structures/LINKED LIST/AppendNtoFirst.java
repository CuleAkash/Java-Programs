import java.util.Scanner;

public class AppendNtoFirst {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		head= appendToFirst(head,num);
		Node<Integer> temp= head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
		
	}
	
	private static Node<Integer> appendToFirst(Node<Integer>head, int num)
	{
		int length= LinkedListUse.length(head);
		Node<Integer> tail=head;
		if(head==null)
		{
			return head;
		}
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		return appendToFirst(head,tail,length-num);
		
	}
	
	public static Node<Integer> appendToFirst(Node<Integer>head,Node<Integer> tail, int num)
	{
		
		System.out.println(num);
		for(int i=0;i<num;i++)
		{
			tail.next= head;
			head=head.next;
			tail=tail.next;
			
			System.out.println("AKASH");
		}
		tail.next=null;
		return head;
		
	}

	

}
