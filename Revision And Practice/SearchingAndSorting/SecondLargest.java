package SearchingAndSorting;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int secondLargest= function(arr,size);
        System.out.println(secondLargest);
        s.close();
    }

    private static int function(int[] arr, int size) {
        int secondLargest=Integer.MIN_VALUE;
        int largest= arr[0];
        for(int i=0;i<size;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }    
}
