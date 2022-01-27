package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class CountSubsequences {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        int sum=s.nextInt();
        int count= countSubseq(arr,sum);
        System.out.println(count);
        s.close();
    }

    private static int countSubseq(int[] arr, int sum) {
        ArrayList<Integer> subs= new ArrayList<>();//Data structure to store the subsequence which is not needed here
        return helper(arr,sum,0,arr.length,subs);
    }

    //We return 1 for successful recursion call and 0 for unsuccessful and atlast add both to get the count 
    private static int helper(int[] arr, int sum, int start, int length, ArrayList<Integer> subs) {
        if(start==length){
            if(sum==0){
                return 1;
            }
            return 0;
        }
        //Not picking
        int left= helper(arr, sum, start+1, length, subs);

        //picking
        subs.add(arr[start]);
        int right= helper(arr, sum-arr[start], start+1, length, subs);
        //backtrack
        subs.remove(subs.size()-1);
        //return total successfull calls
        return left+right;
        }
}
