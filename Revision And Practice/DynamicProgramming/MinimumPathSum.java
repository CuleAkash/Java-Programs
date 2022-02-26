package DynamicProgramming;

import java.util.Scanner;

public class MinimumPathSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] grid= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int minSum= getMininumPathSum(grid);
        System.out.println(minSum);
        sc.close();
    }

    private static int getMininumPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;

        int[][] dp= new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else{
                    int left= Integer.MAX_VALUE;
                    int up= Integer.MAX_VALUE;

                    if(i>0)
                        up= grid[i][j]+dp[i-1][j];

                    if(j>0)
                        left= grid[i][j] + dp[i][j-1];

                    dp[i][j]= Math.min(left, up);
                }
            }
        }
        return dp[m-1][n-1];

    }
}
