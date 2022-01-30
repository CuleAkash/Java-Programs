package SearchingAndSorting;

import java.util.Scanner;

public class MergeTwoSortedArr {
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

        int[] ans= mergeTwoSortedArrays(arr1,arr2,size1,size2);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        s.close();


    }

    private static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2, int size1, int size2) {
        if(arr1.length==0){
            return arr2;
        }
        if(arr2.length==0){
            return arr1;
        }

        int[] ans= new int[size1+size2];
        int i=0,j=0,k=0;
        while(i<size1 && j<size2){
            if(arr1[i]<=arr2[j]){
                ans[k]=arr1[i];
                i++;
            }
            else{
                ans[k]=arr2[j];
                j++;
            }
            k++;
        }

        while(i<size1){
            ans[k]=arr1[i];
            i++;
            k++;
        }

        while(j<size2){
            ans[k]=arr2[j];
            j++;
            k++;
        }

        return ans;
    }
}
