package FUNCTIONSANDSCOPE;

public class discount10 {

	public static void main(String[] args) {
		int Principal=12000;
		double dis1=10.0,dis2=8.0;
		int Amount1= Discount(Principal,dis1);
		int Amount2 = Discount(Principal,dis1,dis2);
		System.out.println(Amount1);
		System.out.println(Amount2);

	}
	
	public static int Discount(int P,double dis)
	{
		int Amount =    (int) (P - P*((dis/100)));
		return Amount;
	}
	
	public static int Discount(int P,double dis1,double dis2)
	{
		int Amount1= (int)(P - P*(dis1/100));
		int Amount2= (int)(Amount1 - Amount1*(dis2/100));
		return Amount2;
	}

}
