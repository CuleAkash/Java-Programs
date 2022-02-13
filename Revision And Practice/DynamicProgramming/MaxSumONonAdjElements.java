package DynamicProgramming;

import java.util.Scanner;

public class MaxSumONonAdjElements {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum= funcRecursive(arr,n-1);
        maxSum= funcIterative(arr,n);
        System.out.println(maxSum);
        sc.close();
    }

    private static int funcIterative(int[] arr, int n) {
        int[] dp= new int[n];
        dp[0]=arr[0];

        for(int i=1;i<n;i++){
            int pick=arr[i];
            if(i-2>=0){
                pick+=dp[i-2];
            }
            int notPick= dp[i-1];
            dp[i]=Math.max(pick, notPick);
        }
        return dp[n-1];
    }

    private static int funcRecursive(int[] arr, int index) {
        if(index==0)
        return arr[0];
        if(index<0)
        return 0;

        int pick= funcRecursive(arr, index-2)+arr[index];
        int notPick= funcRecursive(arr, index-1);

        return Math.max(pick, notPick);
    }
}
