import java.util.Arrays;
import java.util.Scanner;

public class MinNoOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] coins = new int[]{1,2,5,10,20,50,100,500,1000};
        int V = sc.nextInt();

        Arrays.sort(coins);

        int count = 0;
        for(int i=coins.length-1;i>=0;i--){
                while(coins[i]<=V){
                    V-= coins[i];
                    count++;
                }
        }
        System.out.println(count);




        sc.close();
    }
}
