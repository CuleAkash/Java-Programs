import java.util.Scanner;

public class characterclass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the character:");
		//char ch = s.nextLine().charAt(0); // it will identify the first letter from the string
		char ch = s.next().charAt(0); //it will take the character input onlyf
		
		if(ch>= 'A'&& ch<= 'Z') {
			System.out.println("1");
		}
		else if(ch>= 'a' && ch<= 'z')
		{
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}

	}

}
