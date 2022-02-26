package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class TotalUniquePaths {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();

        int ways= countUniquePathsRecursive(m,n);
        ways= countUniquePathsMemoized(m, n);
        ways= countUniquePathsIterative(m, n);
        System.out.println(ways);


        sc.close();
    }

    private static int countUniquePathsIterative(int m, int n) {
        int[][] dp= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                }
                else{
                    int left=0,up=0;
                    if(j>0)
                        left= dp[i][j-1];
                    if(i>0)
                        up= dp[i-1][j];

                    dp[i][j]= left+up;
                }
            }
        }
        return dp[m-1][n-1];
    }

    private static int countUniquePathsMemoized(int m, int n) {
        int[][] dp= new int[m][n];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i], -1);
        }
        return helperMemoized(m-1,n-1,dp);
    }

    private static int helperMemoized(int i, int j, int[][] dp) {
        if(i==0 && j==0)
            return 1;

        if(i<0 || j<0)
            return 0;

        if(dp[i][j]!=-1)
            return dp[i][j];

        int up= helperMemoized(i-1, j, dp);
        int left= helperMemoized(i, j-1, dp);

        dp[i][j]= up+left;
        return dp[i][j];

    }

    public static int countUniquePathsRecursive(int m, int n) {
        return helperRecursive(m-1,n-1);    
    }

    private static int helperRecursive(int i, int j) {
        if(i==0 && j==0)
            return 1;

        if(i<0 || j<0)
            return 0;

        int leftWay= helperRecursive(i, j-1);
        int upWay= helperRecursive(i-1, j);

        return leftWay+upWay;
    }
}
