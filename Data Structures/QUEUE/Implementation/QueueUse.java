package Implementation;

public class QueueUse {

	public static void main(String[] args) throws EmptyQueueException {
		int[] arr= {2,4,3,5,6,8};
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		for(int i: arr)
		{
			queue.enqueue(i);
		}
		System.out.println(queue.size());
		System.out.println(queue.dequeue());
		System.out.println(queue.size());
		System.out.println(queue.front());
		while(!queue.isEmpty())
		{
			System.out.println(queue.size());
			System.out.println(queue.dequeue());
		}
		

	}

}
