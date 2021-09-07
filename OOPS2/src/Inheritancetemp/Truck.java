package Inheritancetemp;

import inheritance.Vehicle;

public class Truck extends Vehicle{
	public Truck(int maxSpeed)
	{
		super(maxSpeed);
	}
	
	int maxOverloeading;
	
	public void printTruck()
	{
		System.out.println("Car "+"Color "+this.getColor()+" maxSpeed "+this.getMaxSpeed()+" maxOverloading "+maxOverloeading);
		// to access maxSpeed and color we either have to make them public or also protected as it will give it access to the sub class also
	}

	
}
