package SearchingAndSorting;

import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        sort(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }

    private static void sort(int[] arr, int size) {
        if(size==0 || size==1){
            return;
        }
        int nextZero=0;
        int nextTwo=size-1;
        int i=0;
        while(i<=nextTwo){
            if(arr[i]==0){
                int temp= arr[i];
                arr[i]=arr[nextZero];
                arr[nextZero]=temp;
                nextZero++;
                i++;
            }
            else if(arr[i]==2){
                int temp= arr[i];
                arr[i]=arr[nextTwo];
                arr[nextTwo]=temp;
                nextTwo--;
            }
            else{
             i++;   
            }
        }

    }
}
