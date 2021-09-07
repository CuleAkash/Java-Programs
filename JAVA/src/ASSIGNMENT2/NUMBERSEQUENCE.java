package ASSIGNMENT2;

import java.util.Scanner;

public class NUMBERSEQUENCE {

	public static void main(String[] args) {
		// the sequence has to be strictly decreasing initially and then it can be increasing or stay decreasing but can't change
		//its status once it changes from decreasing to increasing
		
		Scanner s= new Scanner(System.in);
		int N,current=0,prev=0,i;// declaring previous and current element to keep track of the status
		Boolean isdec =true;//assuming initially it is a decreasing sequence
		System.out.println("Enter the no. of numbers:");
		N = s.nextInt();
		System.out.println("Enter the elements: ");
		prev = s.nextInt();//taking input of the first element
		for(i=1;i<N;i++)
		{
			current= s.nextInt();//taking input of the remaining elements
			
			if(current==prev)//if current=prev it is definitely not strictly increasing or decreasing which is not valid
			{
				System.out.print(false);
				return;
			}
			else if(current>prev)//if this condition is true the sequence becomes increasing
				
			{
				isdec=false;
			}
			else if(current<prev)
			{
				if(isdec==false)//once the sequence change its course from decreasing to increasing it cant change its course 
					//again and if it does it is not valid
				{
					System.out.println(false);
					return;
				}
			}
			prev=current;
			
		}
		System.out.print(true);

	}

}
