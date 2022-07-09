package DynamicProgramming;

import java.util.Scanner;

public class Code3 {
    public static void main(String[] args) {
        Scanner schoolGate = new Scanner(System.in);
        String bachas= schoolGate.nextLine();

        int larkaGinti=0;
        int larkiGinti=0;
        for(int i=0;i<bachas.length();i++){
            if(bachas.charAt(i)=='B')
                larkaGinti++;
            else{
                larkiGinti++;
            }
        }
        int bichKaGinti=0;
        if(larkaGinti>larkiGinti){
            for(int g=0;g<bachas.length()-1;g++){
                if(bachas.charAt(g)=='B' && bachas.charAt(g+1)=='B')
                bichKaGinti++;
            }
        }
        else{
            for(int g=0;g<bachas.length()-1;g++){
                if(bachas.charAt(g)=='G' && bachas.charAt(g+1)=='G')
                bichKaGinti++;
            }
        }
        System.out.println(bichKaGinti);
        schoolGate.close();

    }
}
