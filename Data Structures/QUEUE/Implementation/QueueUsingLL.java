package Implementation;

import RecursiveLL.Node;

public class QueueUsingLL<E> {
	Node<E> front;
	Node<E> rear;
	int size;
	
	public QueueUsingLL()
	{
		front=null;
		rear=null;
		size=0;
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void enqueue(E elem)
	{
		Node<E> newnode= new Node<>(elem);
		if(size==0)
		{
			front=newnode;
		}
		else
		{
			rear.next=newnode;
		}
		size++;
		rear=newnode;
	}
	
	public E dequeue() throws EmptyQueueException
	{
		if(size==0)
		{
			throw new EmptyQueueException();
		}
		size--;
		E temp= front.data;
		front=front.next;
		if(size==0)
		{
			front=null;
			rear=null;
		}
		return temp;
		
	}
	
	public E front() throws EmptyQueueException
	{
		if(size==0)
		{
			throw new EmptyQueueException();
		}
		return front.data;
	}

}
