package Strings;

import java.util.Scanner;

public class WordWiseReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String ans = function1(str);
        ans= function(str);
        System.out.println(ans);
        s.close();
    }

    // with leading trailing and multi-spaces
    private static String function1(String str) {
        str = str.trim();
        if (str.length() == 0) {
            return "";
        }
        String ans = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                if (temp.equals("")) {
                    continue;
                } else {
                    ans = " " + temp + ans;
                    temp = "";
                }
            }
        }
        ans = temp + ans;
        return ans;
    }

    // if there are no leading or trailing spaces and not even multi-spaces
    private static String function(String str) {
        String ans = "";
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                ans = " " + temp + ans;
                temp = "";
            }
        }
        ans = temp + ans;
        return ans;
    }

}
