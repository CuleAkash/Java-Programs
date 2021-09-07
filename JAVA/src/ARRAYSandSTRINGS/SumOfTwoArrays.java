package ARRAYSandSTRINGS;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] A1= {1,9,6,7,8,4};
		int[] A2= {1,2,3};
		int size1= A1.length;
		int size2= A2.length;
		int[] output= add(A1,A2,size1,size2);
		System.out.println("the output array is:");
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+ " ");
		}
		
		

	}
	
	public static int[] add(int[] A1,int[] A2,int size1,int size2) // to ADD THE TWO ARRAYS
	{
		int size3= Math.max(size1, size2)+1;
		int[] output= new int[size3];
		int i= size1-1, j= size2-1,k=size3-1;
		int sum=0,carry=0;
		
		while(i>=0 && j>=0)
		{
			sum = A1[i]+A2[j]+ carry;
			carry= sum/10; // CARRY WILL BE ADDED TO THE NEXT ADDITION
			output[k]= sum%10; // HIGHER NIBBLE WILL BE ADDED TO THE OUTPUT ARRAY
			
			i--;
			j--;
			k--;
		}
		
		while(i>=0)
		{
			sum = A1[i]+carry;
			carry= sum/10;
			output[k]= sum%10;
			i--;
			k--;
		}
		
		while(j>=0)
		{
			sum = A2[j]+carry;
			carry= sum/10;
			output[k]= sum%10;
			j--;
			k--;
		}
		return output;
		
		
	}

}
