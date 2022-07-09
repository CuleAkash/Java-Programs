package BitManipulation;

import java.util.Scanner;

public class XORofElementsinN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.print("The XOR value is: ");
        if(N%4==0)System.out.println(N);
        else if(N%4==1)System.out.println(1);
        else if(N%4==2)System.out.println(N+1);
        else System.out.println(0);

        sc.close();
    }
}