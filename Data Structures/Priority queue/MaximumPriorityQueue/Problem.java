package MaximumPriorityQueue;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        String str = sc.next();
        int l = N/4;

        String[] arr = new String[l];
        int k=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = str.substring(k,k+4);
            k+=4;
        }

        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            String part1 = "abcdefgh";
            String part2 = "ijklmnop";
            for(int j=0;j<s.length()-1;j++){
            if(s.charAt(i)=='0'){
                String p = part1.substring(0,part1.length()/2);
                part2 = part1.substring(part1.length()/2, part1.length());
                part1=p;
            }
            else{
                String  p = part2.substring(0,part2.length()/2);
                part2 = part2.substring(part2.length()/2, part2.length());
                part1 = p;
            }
        }
        if(s.charAt(s.length()-1)=='0')
        System.out.println(part1);
        else
        System.out.println(part2);
        }
    }
}
