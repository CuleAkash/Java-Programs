package Heaps.Basics;

import java.util.ArrayList;

public class MaxHeap {
    private ArrayList<Integer> heap;

    public MaxHeap(){
        heap = new ArrayList<>();
        heap.add(null);
    }

    public void insert(Integer elem){
        if(heap.size()==1)
            heap.add(elem);


        int childIndex = heap.size()-1;
        int parentIndex= childIndex/2;

        while(heap.get(parentIndex)<heap.get(childIndex) && childIndex>1){
            int temp =  heap.get(parentIndex);
            heap.set(parentIndex, heap.get(childIndex));
            heap.set(childIndex, temp);
            childIndex = parentIndex;
            parentIndex = childIndex/2;
        }
    }

    public int remove(){
        int ans = heap.get(1);
        heap.set(1, heap.get(heap.size()-1));//swapped first elem with last elem
        heap.remove(heap.size()-1);//removed the last elem

        //Now heapify
        int parentIndex = 1;
        int leftChildIndex = 2* parentIndex;
        int rightChildIndex =  2* parentIndex+1;
        int minIndex = parentIndex;
        
        while(leftChildIndex<heap.size()){
            //check for leftChildIndex
            if(heap.get(leftChildIndex)>heap.get(minIndex))
                minIndex = leftChildIndex;

            //checking for rightchildIndex
            if(rightChildIndex<heap.size() && heap.get(rightChildIndex)>heap.get(minIndex))
                minIndex =  rightChildIndex;

            //if minIndex is already placed correctly
            if(minIndex==parentIndex)
                break;

            //swap
            int temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex;
            rightChildIndex = 2 * parentIndex +1;

        }
        return ans;

    }
}
