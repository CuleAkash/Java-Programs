package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CombinationSum1 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size=s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int sum=s.nextInt();
        printComb(arr,sum);
        s.close();
    }

    //In combination sum we can pick all the numbers as many times as we need
    private static void printComb(int[] arr, int sum) {
        ArrayList<Integer> comb= new ArrayList<>();//To store the elemenets picked
        helper(arr,sum,comb,0,arr.length);
    }

    private static void helper(int[] arr, int sum, ArrayList<Integer> comb, int start, int length) {
        if(start==length){
            if(sum==0){
                for(int i:comb){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            return;
        }
        
        //picking, if picked can be picked again
        //We can pick the element only if it is less than the sum
        if(arr[start]<=sum){
        comb.add(arr[start]);
        helper(arr, sum-arr[start], comb, start, length);
        //backtrack
        comb.remove(comb.size()-1);
        }
        
        //not picking,as not picked won't be picked further
        helper(arr, sum, comb, start+1, length);
    }
}
