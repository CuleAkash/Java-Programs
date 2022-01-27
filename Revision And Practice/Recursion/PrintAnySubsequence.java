package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAnySubsequence {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size=s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int sum=s.nextInt();
        printAnySubseq(arr,sum);
        s.close();
    }

    private static void printAnySubseq(int[] arr, int sum) {
        ArrayList<Integer> subs= new ArrayList<>();
        helper(arr,sum,0,subs,arr.length);
    }

    //for onr answer return true/false for each recursion call and if true stop the recursion calls right there
    private static boolean helper(int[] arr, int sum, int start, ArrayList<Integer> subs, int length) {
        if(start==length){
            if(sum==0){
                for(int i:subs){
                    System.out.print(i+" ");
                }
                System.out.println();
                return true;
            }
            //if array ends and sum is not equal to the subs sum
            return false;
        }

        //picking the element 
        subs.add(arr[start]);
        //if sum is found in this recursion calll no further recursion calls
        if(helper(arr, sum-arr[start], start+1, subs, length)){
            return true;
        }
        //backtrack
        subs.remove(subs.size()-1);
        //again, is sum is found no need to do further recursion calls
        if(helper(arr, sum, start+1, subs, length)){
            return true;
        }

        //if sum is not found in both recursin calls
        return false;
    }
}
