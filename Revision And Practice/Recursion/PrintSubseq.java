package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubseq {
    public static void main(String[] args) {
        Scanner s= new  Scanner(System.in);
        int size=s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        printSubseq(arr);
        s.close();
    }

    private static void printSubseq(int[] arr) {
        ArrayList<Integer> sub= new ArrayList<>();
        helper(arr,sub,0,arr.length);
    }

    private static void helper(int[] arr, ArrayList<Integer> sub, int start, int length) {
        if(start==length){
            for(int j:sub){
                System.out.print(j+" ");
            }
            System.out.println();
            return;
        }

        //Not taking the element into the subsequence 
        helper(arr, sub, start+1, length);

        //Taking the element into the subsequence
        sub.add(arr[start]);
        helper(arr, sub, start+1, length);
        //backtrack to get the same resultant array 
        sub.remove(sub.size()-1);
    }
}
