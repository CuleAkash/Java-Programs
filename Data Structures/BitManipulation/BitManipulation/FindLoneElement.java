package BitManipulation;

import java.util.Scanner;

public class FindLoneElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        int xor = 0;
        for(int i:arr)
            xor = xor ^ i;

        System.out.println(xor);
    }
}
