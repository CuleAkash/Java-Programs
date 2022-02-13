package DynamicProgramming;

import java.util.Scanner;

public class FrogJumpKDistance {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int length= sc.nextInt();
        int k= sc.nextInt();
        int[] arr= new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        
        int minEnergy= getMinEnergy(arr,length-1,k); 
        minEnergy= getMinEnergyMemoized(arr, length-1, k);
        minEnergy= getMinEnergyIterative(arr,arr.length,k);
        System.out.println(minEnergy);
        sc.close();
    }

    private static int getMinEnergyIterative(int[] arr, int n, int k) {
        int[] dp= new int[n];
        dp[0]=0;

        for(int i=1;i<n;i++){
            int minEnergy= Integer.MAX_VALUE;

            for(int j=1;j<=k;j++){
                if(i-j<0)
                break;
                int jump= Math.abs(arr[i]-arr[i-j])+dp[i-j];
                minEnergy= Math.min(minEnergy, jump);
            }
            dp[i]=minEnergy;
        }
        return dp[n-1];
    }
    private static int getMinEnergyMemoized(int[] arr, int n, int k) {
        int[] dp= new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helperMemoized(arr,n,k,dp);
    }

    private static int helperMemoized(int[] arr, int n, int k, int[] dp) {
        if(n==0)
        {
            dp[0]=0;
            return dp[0];
        }

        if(dp[n]!=-1)
        return dp[n];

        int minEnergy=Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(n-j<0)
            break;
            int jump= Math.abs(arr[n]-arr[n-j]);
            jump+= dp[n-j]==-1?helperMemoized(arr, n-j, k, dp):dp[n-j];
            minEnergy= Math.min(jump,minEnergy);
        }
        dp[n]=minEnergy;
        return dp[n];
    }

    private static int getMinEnergy(int[] arr, int n, int k) {
        if(n==0)
        return 0;

        int minEnergy= Integer.MAX_VALUE;
        for(int j=1;j<=k;j++){
            if(n-j<0)
            break;
            int jump= getMinEnergy(arr, n-j, k)+Math.abs(arr[n]-arr[n-j]);
            minEnergy= Math.min(jump, minEnergy);
        }
        return minEnergy;
    }
}
