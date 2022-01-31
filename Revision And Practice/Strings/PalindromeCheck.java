package Strings;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.next();
        boolean isPalindrome= checkPalindrome(str);
        System.out.println(isPalindrome);
        s.close();
    }

    private static boolean checkPalindrome(String str) {
        if(str.length()==0 || str.length()==1){
            return true;
        }
        int start=0;
        int end= str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
