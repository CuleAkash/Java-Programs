import java.util.Scanner;
public class averagemarks {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the name of the student:");
		String c= s.nextLine();
		int m1,m2,m3;
		System.out.println("enter the marks of the students:");
		m1= s.nextInt();
		m2= s.nextInt();
		m3= s.nextInt();
		
		int avg = (m1+m2+m3)/3;
		System.out.println("the name of the student is:" + c);
		System.out.println(avg);
		

	}

}
