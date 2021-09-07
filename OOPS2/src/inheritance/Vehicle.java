package inheritance;

import generics.VehicleInterface;

public class Vehicle implements VehicleInterface {
	
	public String color;
	protected int maxSpeed;// protected keyword makes the variable accessible in sub classes outside the package also
	public Vehicle(int MaxSpeed)
	{
		System.out.println("Vehicle's Constructor");
		this.maxSpeed=MaxSpeed;
	}
	
	public void setColor(String color)
	{
		this.color= color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed= maxSpeed;
	}

	public int getMaxSpeed()
	{
		return this.maxSpeed;
	}
	
	public final void print()
	{
		System.out.println("Vehicle "+"color-> "+this.color+" maxSpeed-> "+this.maxSpeed);
	}
}
