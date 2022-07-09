package MaximumPriorityQueue;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ifNeg = n<0?true:false;

        n = Math.abs(n);

        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum*10+r;
            n/=10;
        }

        if(-(Math.pow(2, 15)+1)>sum && sum>Math.pow(2, 15)){
            System.out.println("Wrong Answer");
        }

        if(ifNeg)
            System.out.println(-sum);
        else
        System.out.println(sum);
    }
}
