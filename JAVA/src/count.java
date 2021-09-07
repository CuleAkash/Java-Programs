import java.util.Scanner;

public class count {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		for(int p=1;p<=t;p++)
		{
		    int size= s.nextInt();
		    int[] arr= new int[size];
		    for(int i=0;i<size;i++)
		    {
		        arr[i]= s.nextInt();
		    }
		    int[] freq= new int[10];
		    for(int i=0;i<size;i++)
		    {
		        freq[arr[i]]++;
		    }
		    
		    for(int i=0;i<10;i++)
		    {
		        while(freq[i]>0)
		        {
		            System.out.print(i+" ");
		            freq[i]--;
		        }
		    }
		    
		    
		    
		    
		}

	}

}
