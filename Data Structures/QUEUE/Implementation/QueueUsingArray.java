package Implementation;

public class QueueUsingArray {
	private int[] data;
	private int front;
	private int rear;
	private int size;
	
	public QueueUsingArray()
	{
		data= new int[5];
		front=rear=-1;
	}
	
	public QueueUsingArray(int capacity)
	{
		data= new int[capacity];
		this.size=0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public void enqueue(int n)
	{
		if(size==data.length)
		{
			doubleCapacity();
		}
		if(size==0)
		{
			front=0 ;
		}
		rear++;
		if(rear==data.length)// when size is not zero and the rear is at the end it means that there is room in the start, so we set the rear=0
			//to make the queue a circular queue
		{
			rear=0;
		}
		size++;
		data[rear]=n;
	}

	private void doubleCapacity() {
		int[] temp=data;
		data= new int[2*temp.length];// we have to insert the elements in fifo sequence
		int index=0;
		for(int i=front;i<temp.length;i++)
		{
			data[index++]=temp[i];
		}
		for(int i=0;i<=front-1;i++)
		{
			data[index++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
		
	}
	
	public int dequeue() throws EmptyQueueException
	{
		if(size==0)
		{
			throw new EmptyQueueException();
		}
		else
		{
			size--;
			int temp=data[front];
			front++;
			if(front==data.length)//circular queue implementation, when the front gets to the end but size is not zero then it is initialised to zero
				//as size is not zero hence it has an element in the front making it circular queue
			{
				front=0;
			}
			if(size==0)
			{
				front=-1;
				rear=-1;
			}
			return temp;
		}
	}
	
	public int front() throws EmptyQueueException
	{
		if(size==0)
		{
			throw new EmptyQueueException();
		}
		else
		{
			return data[front];
		}
	}
	
	
}

