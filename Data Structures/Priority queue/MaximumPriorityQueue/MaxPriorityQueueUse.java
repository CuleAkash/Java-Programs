package MaximumPriorityQueue;

public class MaxPriorityQueueUse {

	public static void main(String[] args) throws EmptyPriorityQueueException {
		MaxPriorityQueue<Integer> pq= new MaxPriorityQueue<Integer>();
		
		pq.insert(3, 1);
		pq.insert(5, 0);
		pq.insert(6, 2);
		
		System.out.println(pq.getMaximum());
		System.out.println(pq.removeMaximum());
		System.out.println(pq.removeMaximum());
		pq.removeMaximum();
//		System.out.println(pq.getMaximum());
		System.out.println(pq.size());

	}

}
