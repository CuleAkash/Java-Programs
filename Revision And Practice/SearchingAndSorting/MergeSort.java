package SearchingAndSorting;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }

        mergeSort(arr);

        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }

    private static void mergeSort(int[] arr) {
        if(arr.length<=1){
            return;
        }
        int mid= arr.length/2;
        int[] arr1= new int[mid];
        int[] arr2= new int[arr.length-mid];
        for(int i=0;i<mid;i++){
            arr1[i]=arr[i];
        }
        int k=0;
        for(int i=mid;i<arr.length;i++){
            arr2[k]=arr[i];
        }
        mergeSort(arr1);
        mergeSort(arr2);

        merge(arr1,arr2,arr);


    }

    private static void merge(int[] arr1, int[] arr2, int[] arr) {
        int i=0;
        int j=0;
        int k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k++]=arr1[i++];
            }
            else{
                arr[k++]=arr2[j++];
            }
        }

        while(i<arr1.length){
            arr[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr[k++]=arr2[j++];
        }
    }
}
