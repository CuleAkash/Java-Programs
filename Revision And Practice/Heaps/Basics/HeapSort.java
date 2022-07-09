package Heaps.Basics;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];

    for(int i=0;i<size;i++){
        arr[i] = sc.nextInt();
    }

    heapSort(arr);

    for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }

    private static void heapSort(int[] arr) {
        //convert to heap
        arrayToHeap(arr);

        //sorting
        for(int i=arr.length-1;i>0;i--){
            //get max element of max heap to end
            swap(arr, i, 0);
            //convert the remaining array to maxheap
            heapify(arr, 0, i);
        }
    }

    private static void arrayToHeap(int[] arr) {
        int n = arr.length;
        int i = (n/2) -1;

        for(int j=i;j>=0;j--){
            heapify(arr,j,n);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int largest = i;
        int l = 2 * largest + 1;
        int r = 2 * largest + 2;
        int maxIndex = largest;

        while(l<n){
            if(arr[l]>arr[maxIndex])
                maxIndex = l;
            
            if(r<n && arr[r]>arr[maxIndex])
                maxIndex = r;

            if(maxIndex==largest)
                return;

            swap(arr,largest,maxIndex);

            largest = maxIndex;
            l = 2 * largest + 1;
            r = 2 * largest + 2;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
