package Polynomial;

import DynamicArray.DynamicArray;

public class Polynomial {
	DynamicArray data= new DynamicArray();	
	
	public void setCoefficient(int degree, int coef)
	{
		if(degree>=data.size())
		{
			while(degree!=data.size())
			{
				data.add(0);
			}
		}
		if(degree!=data.size())
		{
			data.set(degree, coef);
			return;
		}
		data.add(coef);
	}
	public int getCoefficient(int i)
	{
		if(i>=this.data.size())
		{
			return 0;
		}
		return this.data.get(i);
		
	}
	
	public void print()
	{
		for(int i=0;i<data.size();i++)
		{
			if(data.get(i)!=0)
			{
				System.out.print(data.get(i)+"x^"+i+" ");}
		}
		System.out.println();
		}
	
	public void add(Polynomial p)
	{
		int size= (this.data.size()>p.data.size()?this.data.size():p.data.size());
		
		for(int i=0;i<size;i++)
		{
			int sum= this.data.get(i)+p.data.get(i);
			this.data.set(i, sum);
		}
	}
	
	public void subtract(Polynomial p)
	{
		int size= (this.data.size()>p.data.size()?this.data.size():p.data.size());
		
		for(int i=0;i<size;i++)
		{
			int diff= this.data.get(i)-p.data.get(i);
			this.data.set(i, diff);
		}
	}
	
	public void multiply(Polynomial p)
	{
		Polynomial p3= new Polynomial();
		for(int i=0;i<this.data.size();i++)
		{
			for(int j=0;j<p.data.size();j++)
			{
				int product= this.getCoefficient(i)*p.getCoefficient(j);
				int index= i+j;
				p3.setCoefficient(index, p3.getCoefficient(index)+product);
			}
		}
		for(int i=0;i<p3.data.size();i++)
		{
			this.setCoefficient(i, p3.getCoefficient(i));
		}
	}
	
	public static Polynomial multiply(Polynomial p1,Polynomial p2)
	{
		Polynomial p4= new Polynomial();
		
		for(int i=0;i<p1.data.size();i++)
		{
			for(int j=0;j<p2.data.size();j++)
			{
				int product= p1.getCoefficient(i)*p2.getCoefficient(j);
				int index= i+j;
				p4.setCoefficient(index, p4.getCoefficient(index)+product);
			}
		}
		return p4;
	}
	
	public int evaluate(int j)
	{
		int ans=0;
		for(int i=0;i<this.data.size();i++)
		{
			ans+= this.getCoefficient(i)*(int)(Math.pow(j, i));
		}
		return ans;
	}
	
	
	
	
	
	

}
