package bitwiseandfor;

import java.util.Scanner;

public class bitwiseoperators {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=10,b=2,i;
		System.out.println(a & b);//it will bitwise and all the bits of a and b and give the output
		System.out.println(a | b);// it will bitwise OR all the bits of a and b and then give the output
		System.out.println(~a);// it will complememt all the bits of a and give the output
		i=s.nextInt();
		System.out.println(a << i);//it will shift all the bits left i times and replace the rightmost i bits with 0
			// bitwise left shift multiplies the number by 2 for each shift
		System.out.println(a>>i);// it will shift all the bits right i and fill all the vacant leftest bits by 0 except
		//leftmost bit which will be get the sign bit of the original number
		//bitwise right shift is used to divide the number by 2 for each shift
	}

}
