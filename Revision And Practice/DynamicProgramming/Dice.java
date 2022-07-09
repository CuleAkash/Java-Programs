package DynamicProgramming;

import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t>0)
        {
            int m=scanner.nextInt(), n=scanner.nextInt();
            helper(m,n);
            t--;
        }
    }

    private static void helper(int m,int n) {

            int[] dp = new int[m+1];

            dp[0] = 1;

            for(int i=1; i<=m+1; i++)
            {
                for(int j=1; j<=n+1; j++)
                {
                    if(j<=i)
                    {
                        dp[i] += dp[i-j];
                    }
                }
            }
            System.out.println(dp[m]);
    }    
}
