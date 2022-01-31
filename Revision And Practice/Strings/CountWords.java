package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String str= s.nextLine();
        int count=countWords(str);
        System.out.println("Word Count is: "+count);
        s.close();
    }

    private static int countWords(String str) {
        if(str.length()==0){
            return 0;
        }

        int spaces=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaces++;
            }
        }
        return spaces+1;
    }
}
