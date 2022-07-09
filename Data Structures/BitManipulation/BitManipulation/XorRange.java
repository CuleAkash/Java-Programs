package BitManipulation;

import java.util.Scanner;

public class XorRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        l=l-1;
        int lx = 0;
        if(l%4==0)lx = l;
        else if(l%4==1)lx=1;
        else if(l%4==2)lx=l+1;

        int rx=0;
        if(r%4==0)rx = r;
        else if(r%4==1)rx=1;
        else if(r%4==2)rx=r+1;

        System.out.println(rx);
        System.out.println(lx);
        System.out.println(rx^lx);

        int a =6;
        func(a);
    }

    static void func(double a){
        System.out.println(a);
    }
}
