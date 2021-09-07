package FUNCTIONSANDSCOPE;

public class perimeterofpolygons12 {

	public static void main(String[] args) {

		int side=4,length=5,breadth=4,radius=7;
		double pie = 22.0/7;
		
		int Perimeter_Of_Square= Perimeter(side);
		int Perimeter_Of_Rectangle = Perimeter(length,breadth);
		double Perimeter__Of_Circle = Perimeter(radius,pie);
		
		System.out.println(Perimeter_Of_Square);
		System.out.println(Perimeter_Of_Rectangle);
		System.out.println(Perimeter__Of_Circle);
	}
	
	public static int Perimeter(int s)
	{
		int perimeter = 4*s;
		return perimeter;
	}
	
	public static int Perimeter(int a,int b)
	{
		int perimeter  = 2*(a+b);
		return perimeter;
	}
	
	public static double Perimeter(int r, double p )
	{
		double perimeter = 2*p*r;
		return perimeter;
		
	}
	

}
