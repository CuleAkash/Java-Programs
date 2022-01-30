package SearchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        selectionSort(arr,size);
        System.out.println("Sorted Array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }

    private static void selectionSort(int[] arr, int size) {
        if(size==0 || size==1){
            return;
        }

        //We select the minimum elements for each iteration of the array and put it to its place
        for(int round=0;round<=size-2;round++){
            int minValue= Integer.MAX_VALUE;
            int minIndex= 0;
            for(int i=round;i<size;i++){
                if(arr[i]<minValue){
                    minIndex=i;
                    minValue=arr[i];
                }
            }
            int temp=arr[round];
            arr[round]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

}
