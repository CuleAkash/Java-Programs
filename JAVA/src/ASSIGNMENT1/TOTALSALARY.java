package ASSIGNMENT1;
import java.util.Scanner;

public class TOTALSALARY {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int basic,allow,salary;
		double hra,da,pf;
		
		char ch;
		System.out.println("enter the basic salary and grade:");
		basic= s.nextInt();
		ch= s.next().charAt(0);
		
		hra= (20.0/100)*basic; //hra is double so 20.0/100 which will give double can be stored
		da= (50.0/100)*basic; //da is double and if we had taken float not possible
		pf= (11.0/100)*basic;
		
		salary = (int)(basic+hra+da-pf); //adding int to double which will give double and the typecasting 
											//to store in int variable also rounding off happening
		
		System.out.println("the total salary is:");
		
		if(ch=='A')
		{
			allow=1700;
			System.out.println(salary+allow); //printing salary + allow as salary already rounded off
		}
		else if(ch=='B')
		{
			allow=1500;
			System.out.println(salary+allow);
		}
		else if(ch=='C')
		{
			allow=1300;
			System.out.println(salary+allow);
		}
		
		
	}

}
