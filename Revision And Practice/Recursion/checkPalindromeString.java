package Recursion;

import java.util.Scanner;

public class checkPalindromeString {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.next();
        System.out.println(checkPalin(str));
        s.close();
    }

    private static boolean checkPalin(String str) {
        if(str.length()==0 || str.length()==1){
            return true;
        }
        return helper(str,0,str.length()-1);
    }

    private static boolean helper(String str, int start, int end) {
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;
        }
        return helper(str, start+1, end-1);
    }
}
