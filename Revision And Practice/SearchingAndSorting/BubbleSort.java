package SearchingAndSorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size=s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        } 
        // bubbleSort(arr,size);
        bubbleSortRecursive(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }

    private static void bubbleSort(int[] arr, int size) {
        if(arr.length==0 ||  arr.length==1){
            return;
        }

        //iterate through the array and put the largest element to the last index by compairing in pairs
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    private static void bubbleSortRecursive(int[] arr,int size){
        if(size<=1)
            return;
        for(int i=0;i<size-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        bubbleSortRecursive(arr,size-1);
    }
}
