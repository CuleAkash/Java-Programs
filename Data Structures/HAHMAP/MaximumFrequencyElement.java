import java.util.HashMap;
import java.util.Scanner;

public class MaximumFrequencyElement {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int maxFreq= maxFrequency(arr);
		System.out.println(maxFreq);

	}

	private static int maxFrequency(int[] arr) {
		if(arr.length==0) {
			return 0;
		}
		HashMap<Integer, Integer> map= new HashMap();
		for(int i:arr) {
			if(map.containsKey(i)) {
				int temp= map.get(i);
				temp++;
				map.put(i, temp);
			}
			else {
				map.put(i, 1);
			}
		}
		int maxCount= Integer.MIN_VALUE;
		int max=0;
		for(int i:arr) {
			int temp=map.get(i);
			if(temp>maxCount) {
				max=i;
				maxCount=temp;
			}
		}
		return max;
	}

}
