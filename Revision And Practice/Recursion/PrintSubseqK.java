package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubseqK {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int sum=s.nextInt();
        printSubsK(arr,sum);
        s.close();
    }

    private static void printSubsK(int[] arr, int sum) {
        ArrayList<Integer> subs= new ArrayList<>();
        helper(arr,subs,0,sum,arr.length);
    }

    private static void helper(int[] arr, ArrayList<Integer> subs, int start, int sum, int size) {
        if(start==size){
            if(sum==0){
                for(int i:subs){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            return;
        }
        //taking the element
        subs.add(arr[start]);
        //if taking subtract it from the sum for nxt recursion call
        helper(arr, subs, start+1, sum-arr[start], size);
        //backtrack
        subs.remove(subs.size()-1);

        //Not taking the element
        helper(arr, subs, start+1, sum, size);
    }
}
