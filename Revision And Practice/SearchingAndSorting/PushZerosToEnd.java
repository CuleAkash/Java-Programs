package SearchingAndSorting;

import java.util.Scanner;

public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        function(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();

    }

    private static void function(int[] arr, int size) {
        int nonZero= 0;
        for(int i=0;i<size;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[nonZero];
                arr[nonZero]=temp;
                nonZero++;
            }
        }
        
    }
}
