package Basics;

public class MinimumHeapUse {

	public static void main(String[] args) throws EmptyPriorityQueueException{
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		pq.insert(4, 1);
		pq.insert(2, 0);
		pq.insert(4, 5);
		
		System.out.println(pq.removeMinimum());
		System.out.println(pq.getMinimum());
		System.out.println(pq.removeMinimum());
		pq.removeMinimum();
		System.out.println(pq.size());

	}

}
