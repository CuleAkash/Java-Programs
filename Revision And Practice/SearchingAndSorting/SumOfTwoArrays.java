package SearchingAndSorting;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size1= s.nextInt();
        int size2= s.nextInt();
        int[] arr1= new int[size1];
        int[] arr2= new int[size2];
        for(int i=0;i<size1;i++){
            arr1[i]=s.nextInt();
        } 
        for(int i=0;i<size2;i++){
            arr2[i]=s.nextInt();
        } 

        int[] output= new int[Math.max(size1, size2)+1];
        sum(arr1,arr2,size1,size2,output);
        for(int i=0;i<output.length;i++){
            System.out.print(output[i]);
        }
        s.close();
    }

    private static void sum(int[] arr1, int[] arr2, int size1, int size2, int[] output) {
        if(size1==0){
            for(int i=0;i<size2;i++){
                output[i]=arr2[i];
            }
        }

        if(size2==0){
            for(int i=0;i<size1;i++){
                output[i]=arr1[i];
            }
        }
        int i=size1-1;
        int j=size2-1;
        int k= Math.max(size1-1, size2-1);
        int carry=0;

        while(i>=0 && j>=0){
            int sum= arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }

        while(i>=0){
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j--;
            k--;
        }

        output[0]=carry;
    }
    
}
