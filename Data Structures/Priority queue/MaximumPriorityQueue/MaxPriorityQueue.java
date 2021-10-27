package MaximumPriorityQueue;

import java.util.ArrayList;



public class MaxPriorityQueue <E> {
	ArrayList<Element<E>> heap;
	
	public MaxPriorityQueue() {
		heap= new ArrayList<Element<E>>();
	}
	
	public void insert(E value, int priority) {
		Element<E> e= new Element<>(value, priority);
		heap.add(e);
		
		int childIndex= heap.size()-1;
		int parentIndex= (childIndex-1)/2;
		
		//Up heapify
		while(childIndex>0 && heap.get(parentIndex).priority< heap.get(childIndex).priority) {
			Element<E> temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(childIndex));
			heap.set(childIndex, temp);
			childIndex= parentIndex;
			parentIndex= (childIndex-1)/2;
		}
		
	}
	
	public E getMaximum() throws EmptyPriorityQueueException {
		if(this.isEmpty()) {
			throw new EmptyPriorityQueueException();
		}
		return heap.get(0).value;
	}
	
	public E removeMaximum() throws EmptyPriorityQueueException{
		if(heap.isEmpty()) {
			throw new EmptyPriorityQueueException();
		}
		
		Element<E> e= heap.get(0);
		E ans= e.value;
		
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		//Down heapify
		
		int parentIndex= 0;
		int leftchildIndex= 2*parentIndex+1;
		int rightChildIndex= 2*parentIndex+2;
		int maxIndex= parentIndex;
		
		while(leftchildIndex<heap.size()) {
			if(heap.get(maxIndex).priority< heap.get(leftchildIndex).priority) {
				maxIndex= leftchildIndex;
			}
			
			if(rightChildIndex<heap.size() && heap.get(maxIndex).priority<heap.get(leftchildIndex).priority) {
				maxIndex= rightChildIndex;
			}
			
			if(maxIndex==parentIndex) {
				break;
			}
			
			Element<E> temp= heap.get(maxIndex);
			heap.set(maxIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			
			parentIndex= maxIndex;
			leftchildIndex= (2*parentIndex+1);
			rightChildIndex= 2*parentIndex+2;
		}
		return ans;
	}
	
	public int size() {
		return heap.size();
	}
	
	
	public boolean isEmpty() {
		return heap.size()==0?true:false;
	}	
	
	
}
