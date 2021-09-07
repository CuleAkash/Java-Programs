package fraction;

public class fraction { 
		private int numerator;
		private int denominator;
		public fraction(int numerator,int denominator)// constructer to construct an object of class fraction with arguments numerator and denominator
		{
			this.numerator=numerator;
			this.denominator= denominator;
			simplify();
		}
		
		private void simplify()// to get the fraction in its simplest form// it is private as to simplify, it is an internal process and i dont want to give access of this to anyone
		{
			int gcd=1;
			int smallest= Math.min(numerator, denominator);
			for(int i=2;i<=smallest;i++)
			{
				if(numerator%i==0 && denominator%i==0)
				{
					gcd=i;
				}
			}
			numerator= numerator/gcd;
			denominator= denominator/gcd;
		}
		
		public void print()
		{
			System.out.println(numerator+"/"+denominator);
		}
		
		public void setNumerator(int numerator)// to set numerator according to our choice
		{
			this.numerator= numerator;
			simplify();
		}
		
		public int getNumerator()
		{
			return this.numerator;
		}
		
		public void increment()
		{
			this.numerator= this.numerator+this.denominator;
			simplify();
		}
		
		public int getDenominator()
		{
			return this.denominator;
		}
		public void setDenominator(int denominator)
		{
			if(denominator==0)
			{
				return;
			}
			this.denominator= denominator;
		}
		
		public void add(fraction f2)// to add a fraction to another fraction but by this the original fraction will be lost and we wont be able to use it for some other purpose
		{
			int n2= f2.numerator;
			int d2= f2.denominator;
			int n1= this.numerator;
			int d1= this.denominator;
			int lcm=1;
			int greater= Math.max(d1, d2);
			for(int i=greater;i<=d1*d2;i++)
			{
				if(i%d1==0 && i%d2==0)
				{
					lcm=i;
					break;
				}
			}
			this.denominator= lcm;
			this.numerator= ((lcm/d1)*n1)+((lcm/d2)*n2);
			simplify();
			
		}
		
		public static fraction add(fraction f1, fraction f2)// to construct a new object of the same class and store the value of the sum in that object and then return the object
		{
			int num1= f1.numerator*f2.denominator + f2.numerator*f1.denominator;
			int den1= f1.denominator*f2.denominator;
			fraction f3= new fraction(num1,den1);
			return f3;
		
	}
		public static fraction subtract(fraction f1,fraction f2)// they are static as we are passing the fractions already that are going to be used so no need to specify an object
		{
			int num1= f1.numerator*f2.denominator - f2.numerator*f1.denominator;
			int den1= f1.denominator*f2.denominator;
			fraction f3= new fraction(num1,den1);
			return f3;
		}
		
		public static fraction multiply(fraction f1, fraction f2)
		{
			int num1= f1.numerator * f2.numerator;
			int den1= f1.denominator*f2.denominator;
			fraction f3= new fraction(num1,den1);
			return f3;
		}
		
		public static fraction divide(fraction f1,fraction f2)
		{
			int num1= f1.numerator * f2.denominator;
			int den1= f1.denominator*f2.numerator;
			fraction f3= new fraction(num1,den1);
			return f3;
		}
		
		

}
