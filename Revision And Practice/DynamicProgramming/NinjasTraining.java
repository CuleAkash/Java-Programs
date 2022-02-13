package DynamicProgramming;

import java.util.Scanner;

public class NinjasTraining {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int days= s.nextInt();
        int[][] routine= new int[days][3];
        for(int i=0;i<days;i++){
            for(int j=0;j<=2;j++){
                routine[i][j]=s.nextInt();
            }
        }
        int maxMeritPoints= funcRecursive(routine);
        maxMeritPoints= funcMemoized(routine);
        System.out.println(maxMeritPoints);
        s.close();
    }

    private static int funcMemoized(int[][] routine) {
        int[][] dp= new int[routine.length][4];
        for(int i=0;i<routine.length;i++){
            for(int j=0;j<4;j++){
                dp[i][j]=-1;
            }
        }
        return helperMemoized(routine,routine.length-1,3,dp);
        
    }

    private static int helperMemoized(int[][] routine, int day, int preTask, int[][] dp) {
        int maxSum= Integer.MIN_VALUE;
        if(day==0){
            for(int i=0;i<3;i++){
                if(i!=preTask){
                    maxSum= Math.max(maxSum, routine[day][i]);
                }
            }
            dp[0][preTask]=maxSum;
            return maxSum;
        }

        if(dp[day][preTask]!=-1){
            return dp[day][preTask];
        }

        for(int i=0;i<3;i++){
            int sum=0;
            if(i!=preTask){
                helperMemoized(routine, day-1, i, dp);
                sum= routine[day][i]+dp[day-1][i];
            }
            maxSum= Math.max(sum, maxSum);
        }
        dp[day][preTask]=maxSum;
        return dp[day][preTask];
    }

    private static int funcRecursive(int[][] routine) {
        // * For the last day we have all possible tasks free to be done
        return helperRecursive(routine,routine.length-1,3);
    }

    private static int helperRecursive(int[][] routine, int day, int preTask) {
        int maxSum= Integer.MIN_VALUE;
        if(day==0){
            for(int i=0;i<3;i++){
                if(i!=preTask){
                    maxSum=Math.max(maxSum,routine[0][i]);
                }
            }
            return maxSum;
        }

        for(int i=0;i<3;i++){
            int sum= 0;
            if(i!=preTask){
                sum= routine[day][i] + helperRecursive(routine, day-1, i);
            }
            maxSum= Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
