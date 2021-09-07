import java.util.HashMap;
import java.util.Scanner;

public class ArrayIntersection {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size= s.nextInt();
		int[] arr= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int size2= s.nextInt();
		int[] arr2= new int[size2];
		for(int i=0;i<size2;i++) {
			arr2[i]=s.nextInt();
		}
		
		printIntersection(arr,arr2);

	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		if(arr1.length==0 || arr2.length==0){
			return;
		}
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i:arr1) {
			if(map.containsKey(i)) {
				int temp= map.get(i);
				temp++;
				map.put(i, temp);
			}
			else {
				map.put(i, 1);
			}
		}
		
		for(int i:arr2) {
			if(map.containsKey(i)) {
				System.out.print(i+" ");
				int temp= map.get(i);
				temp--;
				if(temp==0) {
					map.remove(i);
				}
				else {
					map.put(i, temp);
				}
			}
		}
		
		
		
	}

}
