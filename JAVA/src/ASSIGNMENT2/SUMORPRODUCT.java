package ASSIGNMENT2;

import java.util.Scanner;

public class SUMORPRODUCT {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num,N,sum=0,product=1,choice;
		System.out.println("Enter the number:");
		N= s.nextInt();
		System.out.println("enter your choice:");
		choice= s.nextInt();
		
		switch(choice)
		{
		case 1:{
			for(num=1;num<=N;num++)
			{
				sum +=num;
			}
			System.out.println("The sum of the numbers is: " + sum);
			break;
		}
			
		case 2:{
			for(num=1;num<=N;num++)
			{
				product*= num;
			}
			System.out.println("The produst of the numers is: " + product);
			break;
		}
		
		default:
			System.out.println("-1");
				
			
			
		}
		
		

	}

}
