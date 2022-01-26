package Recursion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];

        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }

        reverseArr(arr);

        for(int elem:arr){
            System.out.print(elem+" ");
        }
        s.close();
    }

    public static void reverseArr(int[] arr) {
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        if(start>=end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        reverse(arr, start+1, end-1);
    }
}
