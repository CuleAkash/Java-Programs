package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintPermutations {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        printPerm(arr);
        s.close();
    }

    private static void printPerm(int[] arr) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds= new ArrayList<>();
        boolean[] visited= new boolean[arr.length];
        getPermutations(arr,ds,ans,visited);
        System.out.println(ans);
    }

    private static void getPermutations(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] visited) {
        if(arr.length==0){
            return;
        }

        //all indices are selected
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
        }

        for(int i=0;i<arr.length;i++){
            if(!visited[i]){
                visited[i]=true;
                ds.add(arr[i]);
                getPermutations(arr, ds, ans, visited);
                ds.remove(ds.size()-1);
                visited[i]=false;
            }
        }
    }
}
