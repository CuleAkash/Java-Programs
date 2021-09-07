package complexNumber;

public class ComplexNumber {
	private int real;
	private int imaginary;
	
	public ComplexNumber(int real, int imaginary)
	{
		this.real= real;
		this.imaginary= imaginary;
	}
	
	public void print()
	{
		
		System.out.println(this.real+"+i"+"("+this.imaginary+")");
	}

	public void setReal(int real)
	{
		this.real= real;
	}
	
	public void setImaginary(int imaginary)
	{
		this.imaginary= imaginary;
	}
	
	public void add(ComplexNumber c2)
	{
		this.real+= c2.real;
		this.imaginary+= c2.imaginary;
	}
	
	public void multiply(ComplexNumber c2)
	{
		this.real= this.real*c2.real - this.imaginary*c2.imaginary;
		this.imaginary= this.imaginary*c2.real +this.real*c2.imaginary;
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2)
	{
		int real1= c1.real+c2.real;
		int imag1= c1.imaginary+c2.imaginary;
		ComplexNumber c4= new ComplexNumber(real1, imag1);
		return c4;
	}
}
