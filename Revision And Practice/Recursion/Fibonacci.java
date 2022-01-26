package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N=s.nextInt();
        System.out.println(fibonacci(N));
        s.close();
    }

    private static int fibonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
