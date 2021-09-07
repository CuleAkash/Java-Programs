package Implementation;

import RecursiveLL.Node;

public class StackUsingLL<E> {
	
	private Node<E> head;
	private int size;
	
	public StackUsingLL()
	{
		this.head=null;
		this.size=0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return this.size==0;
	}
	
	public void push(E data)
	{
		Node<E> newnode= new Node<>(data);
		if(head==null)
		{
			this.head=newnode;
		}
		else
		{
			newnode.next=this.head;
			this.head=newnode;
		}
		size++;
	}
	
	public E pop() throws StackEmptyException
	{
		if(this.size==0 || this.head==null)
		{
			throw new StackEmptyException();
		}
		E num= head.data;
		head=head.next;
		this.size--;
		return num;	
	}
	
	public E peek() throws StackEmptyException
	{
		if(this.size==0 || this.head==null)
		{
			throw new StackEmptyException();
		}
		return head.data;
	}
	

}
