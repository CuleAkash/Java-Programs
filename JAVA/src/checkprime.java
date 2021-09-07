import java.util.Scanner;

public class checkprime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int i=2,n,flag=0;
		 System.out.println("enter the no.:");
		 n= s.nextInt();
		 while(i<=n/2)
		 {
			 if(n%i==0)
			 {
				 flag=1; // for n being divisible by every i flag =1
			 }
			 i++;
			
		 }
		 
		 if(flag==1)
		 System.out.println(n + " is not prime");
		 else
		 {
			 System.out.println(n + " is prime");
		 }
		 
	}

}
