package Recursion;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N= s.nextInt();
        System.out.println(factorial(N));
        s.close();
    }

    private static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
   
}
