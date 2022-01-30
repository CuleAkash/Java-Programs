package SearchingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    int size= s.nextInt();
    int[] arr= new int[size];
    for(int i=0;i<size;i++){
        arr[i]=s.nextInt();
    }
    int k= s.nextInt();
    Arrays.sort(arr);
    System.out.println("K is present at "+binarySearch(arr,k));
    System.out.println("K is present at "+recursiveBinarySearch(arr,k));
    s.close();
}

    private static int recursiveBinarySearch(int[] arr, int k) {
        return helper(arr,k,0,arr.length-1);
    }

    //Recursive solution
    private static int helper(int[] arr, int k, int start, int end) {
        if(start>end){
            return -1;
        }

        int mid= (end-start)/2+start;
        if(arr[mid]==k){
            return mid;
        }
        else if(arr[mid]>k){
            return helper(arr, k, start, mid-1);
        }
        else{
            return helper(arr, k, mid+1, end);
        }
    }

    //Iterative approach
    private static int binarySearch(int[] arr, int k) {
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}
