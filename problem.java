import java.util.Scanner;

public class problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int maxSum=0;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               sum+=arr[j];
               maxSum= Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);
    }
}
