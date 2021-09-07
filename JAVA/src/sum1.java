import java.util.Arrays;
import java.util.Scanner;

public class sum1 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t= s.nextInt();
		for(int j=1;j<=t;j++){
		    int n= s.nextInt();
		    int k= s.nextInt();
		    int[] arr= new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    Arrays.sort(arr);
		    int sum=0;
		    for(int i=0;i<n;i++){
		        if(arr[i]<0){
		            if(k!=0){
		                sum+=Math.abs(arr[i]);
		                k--;
		            }
		        }
		        else{
		            sum+=arr[i];
		        }
		    }
		    System.out.println(sum);
		}
	}
}
