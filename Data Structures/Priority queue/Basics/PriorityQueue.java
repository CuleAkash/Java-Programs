package Basics;

import java.util.ArrayList;

import MaximumPriorityQueue.Element;

public class PriorityQueue<E> {
	private ArrayList<Element<E>> heap;
	
	public PriorityQueue() {
		heap= new ArrayList<>();
	}
	
	
	public void insert(E value, int priority) {
		Element<E> e= new Element<>(value, priority);
		
		heap.add(e);
		int childIndex= heap.size()-1;
		int parentIndex= (childIndex-1)/2;
		//Now use Up-heapify
		
		while(childIndex>0 && heap.get(parentIndex).priority> heap.get(childIndex).priority) {
				Element<E> temp= heap.get(parentIndex);
				heap.set(parentIndex, heap.get(childIndex));
				heap.set(childIndex, temp);
				childIndex= parentIndex;
				parentIndex= (childIndex-1)/2;
		}
	}
	
	//if the heap is already empty we will throw an exception  else we will return the first element of the arraylist
	public E getMinimum() throws EmptyPriorityQueueException {
		if(this.isEmpty()) {
			throw new EmptyPriorityQueueException();
		}
		return heap.get(0).value;
	}
	
	public E removeMinimum() throws EmptyPriorityQueueException {
		//if the heap is already empty
		if(this.isEmpty()) {
			throw new EmptyPriorityQueueException();
		}
		
		//Replace the first(smallest) element with the last element to maintain the complete binary tree conition
		//Then remove the last index element
		Element<E> e= heap.get(0);
		E ans=  e.value;
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		
		//Down heapify
		int parentIndex= 0;
		int rightChildIndex= 2*parentIndex+2;
		int leftChildIndex= 2*parentIndex+1;
		int minIndex= parentIndex;
		
		//if the element doesn't have a leftChild it will surely not have a right child
		while(leftChildIndex<heap.size()) {
			//now compare the priorities of parentIndwex amd child indices
			
			if(heap.get(leftChildIndex).priority< heap.get(minIndex).priority) {
				minIndex= leftChildIndex;
			}
			
			//if the righnt child is not there
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex).priority < heap.get(minIndex).priority) {
				minIndex= rightChildIndex;
			}
			
			//if the parent index is itself the minimum then we have reached our desired state and no need to go further
			if(minIndex== parentIndex) {
				break;
			}
			
			
			Element<E> temp= heap.get(minIndex);
			heap.set(minIndex, heap.get(parentIndex));
			heap.set(parentIndex, temp);
			
			parentIndex= minIndex;
			leftChildIndex= 2*parentIndex+1;
			rightChildIndex= 2*parentIndex+2;
		}
		return ans;
	}
	
	
	//size of arraylist is size of the heap
	public int size() {
		return heap.size();
	}
	
	
	//if the arraylist is empty then the heap is also empty
	public boolean isEmpty() {
		return this.size()==0?true:false;
	}
}
