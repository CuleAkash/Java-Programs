import java.util.Scanner;

public class fahrenheittocelcius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s,e,w,c;
		System.out.println("enter the lower limit:");
		s= sc.nextInt();
		System.out.println("enter the upper limit:");
		e= sc.nextInt();
		System.out.println("enter the step size:");
		w= sc.nextInt();
		
		System.out.println("the table is:");
		
		if((s>=0 && s<=80) && (e>=s && e<=900) && (w>=0 && w<=40))
		{
			while(s<=e)
			{
				c= (int) ((5.0/9)* (s-32));// 5.0/9 wll give a double value hence cant be stored in int c variable
				// so we typecasted the double into int
				System.out.println(s+ "\t"+c);
				s=s+w;
						
			}
		}
		

	}

}
