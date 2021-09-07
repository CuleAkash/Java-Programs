package SearchAndSort;

public class EquilibriumIndex {

	public static void main(String[] args) {
		int[] arr= {1,4,9,3,2};
		int size= arr.length;
		int i=0;
		int sum_left=0;
		int sum_right=0;
		for(int j=1;j<size;j++)
		{
			sum_right+= arr[j];
		}
		while(i<size)
		{
			if(sum_left!=sum_right)
			{
				sum_left+= arr[i];
				sum_right-= arr[i+1];
				i++;
			}
			else {
				break;
			}
		}
		System.out.println(i);

	}

}
