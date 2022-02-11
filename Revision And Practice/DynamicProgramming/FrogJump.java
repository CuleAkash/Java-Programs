package DynamicProgramming;

import java.util.Scanner;

public class FrogJump{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int[] arr= new int[s.nextInt()];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }

        int ans=getMinEnergy(arr,arr.length-1);
        ans= getEnergyMemoized(arr);
        ans= getEnergyIterative(arr);
        System.out.println(ans);
        s.close();
    }

    private static int getEnergyIterative(int[] arr) {
        int dp[] = new int[arr.length];
        dp[0]=0;
        dp[1]= Math.abs(arr[1]-arr[0]);
        for(int i=2;i<arr.length;i++){
            int singleJump= Math.abs(arr[i]-arr[i-1])+dp[i-1];
            int doubleJump= Math.abs(arr[i]-arr[i-2])+dp[i-2];
            dp[i]= Math.min(singleJump, doubleJump);
        }
        return dp[arr.length-1];
    }

    private static int getEnergyMemoized(int[] arr) {
        int n=arr.length-1;
        int[] dp= new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helperMemoized(arr,n,dp);
    }

    private static int helperMemoized(int[] arr, int n, int[] dp) {
        if(n<=1){
            dp[n]=Math.abs(arr[n]-arr[0]);
            return dp[n];
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int singleJump= Math.abs(arr[n]-arr[n-1]);
        int doubleJump= Math.abs(arr[n]-arr[n-2]);

        singleJump+= dp[n-1]==-1?helperMemoized(arr, n-1, dp):dp[n-1];
        doubleJump+= dp[n-2]==-1?helperMemoized(arr, n-2, dp):dp[n-2];

        dp[n]=Math.min(singleJump ,doubleJump);
        return dp[n];
    }

    private static int getMinEnergy(int[] arr, int n) {
        if(n==0){
            return 0;//If the frog is on the 0th stair it wont take any energy to reach 0th stair
        }

        //for 1 stair jump it will cost the energy same to the diff between arr[indexes] and energy for remaining stairs after the jump

        int singleJump= getMinEnergy(arr, n-1) + Math.abs(arr[n]-arr[n-1]);
        int doubleJump=Integer.MAX_VALUE;
        if(n>1){
             doubleJump= getMinEnergy(arr, n-2) + Math.abs(arr[n]-arr[n-2]);
        }
        return Math.min(singleJump, doubleJump);

    }
    //It contains overlapping subproblems so we will memoize it


}