
public class MergeSort {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		head=mergeSort(head);
		LinkedListUse.printLinkedList(head);

	}
	
	public static Node<Integer> mergeSort(Node<Integer> head)
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		Node<Integer> fast= head,slow=head;
		while(fast.next!=null && fast.next.next!=null)
		{
			fast=fast.next.next;
			slow=slow.next;
		}
		Node<Integer> head1= head,head2=slow.next;
		slow.next=null;
		head1=mergeSort(head1);
		head2=mergeSort(head2);
		Node<Integer> newhead=merge(head1,head2);
		return newhead;	
	}
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node<Integer> head=null,tail=null,temp1=head1,temp2=head2;
		if(head1.data<head2.data)
		{
			head=head1;
			tail=head1;
			temp1=temp1.next;
		}
		else
		{
			head=head2;
			tail=head2;
			temp2=temp2.next;
		}
		
		while(temp1!=null && temp2!=null)
		{
			if(temp1.data<temp2.data)
			{
				tail.next=temp1;
				temp1=temp1.next;
				tail=tail.next;
			}
			else
			{
				tail.next=temp2;
				temp2=temp2.next;
				tail=tail.next;
			}
		}
		
		if(temp1!=null)
		{
			tail.next=temp1;
		}
		if(temp2!=null)
			tail.next=temp2;
		
		return head;
	}

}
