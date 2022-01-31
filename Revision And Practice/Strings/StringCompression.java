package Strings;

import java.util.Scanner;

public class StringCompression {
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    String str= s.next();
    System.out.println(compress(str));
    s.close();
}

private static String compress(String str) {
    if(str.length()==0){
        return "";
    }

    if(str.length()==1){
        return str;
    }
    String ans="";
    ans+=str.charAt(0);
    int currentCount=1;
    for(int i=1;i<str.length();i++){
        if(str.charAt(i-1)==str.charAt(i)){
            currentCount++;
        }
        else{
            if(currentCount>1){
                ans+=currentCount;
                currentCount=1;
            }
            ans+=str.charAt(i);
        }
    }
        if(currentCount>1){
            ans+=currentCount;
        }
        
    return ans;
}
}
