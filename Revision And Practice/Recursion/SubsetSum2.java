package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SubsetSum2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        } 
        getSubsets2(arr,arr.length);
        s.close();
    }

    private static void getSubsets2(int[] arr, int length) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        Arrays.sort(arr);
        getSubsets(arr,length,ans,ds,0);
        System.out.println(ans);
    }

    private static void getSubsets(int[] arr, int length, List<List<Integer>> ans, List<Integer> ds, int index) {
        if(length==0){
            return;
        }

        //if ans already contains the ds
        if(ans.contains(ds)){
            return;
        }

        //To get all the possible subsets 
        ans.add(new ArrayList<>(ds));

        for(int i=index;i<length;i++){
            if(i!=index && arr[i]==arr[i-1]){
                continue;
            }//avoid duplication

            //pick unique index
            ds.add(arr[i]);
            getSubsets(arr, length, ans, ds, i+1);
            //backtrack
            ds.remove(ds.size()-1);

        }
    }
}
