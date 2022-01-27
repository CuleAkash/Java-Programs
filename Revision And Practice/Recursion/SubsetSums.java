package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SubsetSums {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        ArrayList<Integer> ans= new ArrayList<>();
        subsetSums(arr,ans,0,0,arr.length);
        Collections.sort(ans);
        System.out.println(ans);
        s.close();
    }

    private static void subsetSums(int[] arr, ArrayList<Integer> ans, int index, int sum, int length) {
        if(index==length){
            ans.add(sum);
            return;
        }

        //pick the element
        subsetSums(arr, ans, index+1, sum+arr[index], length);

        //not pick the element
        subsetSums(arr, ans, index+1, sum, length);

    }
}
