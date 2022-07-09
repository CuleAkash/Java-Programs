package DynamicProgramming;

import java.util.Scanner;

public class NumberEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1= scanner.nextLine();
        String input= scanner.nextLine();
        StringBuffer str= new StringBuffer(str1);
        int pointer=0;
        for(int i=0;i<input.length();i++){
            char t= input.charAt(i);
            switch (t) {
                case 'R':
                if(pointer<str.length()-1){
                    pointer++;
                  }
                //   i++;
                    break;
                case 'L':
                if(pointer>0){
            	    pointer--;
                }
                // i++;
                break;
                case 'T':
                if(str.charAt(pointer)!='9'){
                    str.setCharAt(pointer, (char)(str.charAt(pointer)+1));
                }
                // i++;
                break;
                case 'D':
                if(str.charAt(pointer)!='0'){
                    str.setCharAt(pointer, (char)(str.charAt(pointer)-1));
                }
                // i++;
                break;
                case 'S':
                    i++;
                    String tempStr="";
                    for(;i<input.length() && input.charAt(i)>='0' && input.charAt(i)<='9';i++)
                        tempStr+=input.charAt(i);
                    i--;
                    int ind= Integer.parseInt(tempStr);
                    char temp1= str.charAt(pointer);
                    char temp2= str.charAt(ind-1);
                    str.setCharAt(pointer, temp2);
                    str.setCharAt(ind-1, temp1);
                break;
                
            }
            // if(input.charAt(i)=='R'){
            //     pointer++;
            //     i++;
            // }
            // else if(input.charAt(i)=='L'){
            //     pointer--;
            //     i++;
            // }
            // else if(input.charAt(i)=='T'){
            //     if(str.charAt(pointer)!='9'){
            //         str.setCharAt(pointer, (char)(str.charAt(pointer)+1));
            //     }
            //     i++;
            // }
            // else if(input.charAt(i)=='D'){
            //     if(str.charAt(pointer)!='0'){
            //         str.setCharAt(pointer, (char)(str.charAt(pointer)-1));
            //     }
            //     i++;
            // }
            // else if(input.charAt(i)=='S'){
            //     i++;
            //     int tempIndex= input.charAt(i)-'0';
            //     char temp= str.charAt(tempIndex-1);
            //     str.setCharAt(tempIndex-1, str.charAt(pointer));
            //     str.setCharAt(pointer, temp);
            //     i++;
            // }
        }
        System.out.println(str);

    }
}
 class kuki{
     public static void main(String[] args) {
        StringBuilder num= new StringBuilder("");
		Scanner s= new Scanner(System.in);
		num.append(s.nextLine());
		
		StringBuilder str= new StringBuilder("");
		str.append(s.nextLine());
		int j=0;
		char k='0';
		for(int i=0 ;i<str.length();i++) {
			switch (str.charAt(i)) {
			
			case 'R' :
                if(j<num.length()-1)
				j++;
				k=num.charAt(j);
				break;
			case 'L' :
				j--;
				k=num.charAt(j);
				break;
			case 'T' :
				if(num.charAt(j) != '9') {
					num.setCharAt(j, k++);
				}
				break;
			case 'D' :
				if(num.charAt(j) != '0') {
					num.setCharAt(j, k--);
				}
				break;
			case 'S' :
				i++;
				char temp=num.charAt(j);
				int nv=str.charAt(i)-'0';
				char mag=num.charAt(nv-1);
				num.setCharAt(j, mag);
				num.setCharAt(nv-1, temp);
				break;
			}
		}
		System.out.println(num);
     }
 }