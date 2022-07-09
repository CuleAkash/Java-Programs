package BitManipulation;

import java.util.Scanner;

public class LastSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int i=0;

        while(N>0){
             N = N & (~(1<<i));
             if(N==0)
                break;
            i++;
        }

        System.out.println(i);
    }
}
