package ASSIGNMENT1;
import java.util.Scanner;
public class SUMOFEVENANDODD {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n,r,sume=0,sumo=0;
		System.out.println("enter the number");
		n= s.nextInt();
		
		while(n>0)
		{
			r= n%10;
			
			if(r%2==0)
			{
				sume= sume+r;
			}
			else
			{
				sumo= sumo+r;
			}
			n=n/10;
		}
		System.out.println(sume + "  " + sumo);

	}

}
