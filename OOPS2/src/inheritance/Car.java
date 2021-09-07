package inheritance;

public class Car extends/*keyword to inherit from a class*/ Vehicle {
	// the Car class will get all the properties and functionalities of the vehicle class
	// in addition to that it can also have its own properties
	int numDoors;
	public void printCAr()// if we make a function final in parent class any sub class function cant override the parent class funv=ction
	{
		super.print();// to access the print() in the super class or base class of this class
		System.out.println("Car "+"Color "+this.getColor()+" maxSpeed "+this.getMaxSpeed()+" "+numDoors);}// we cant access color and maxspeed directly from vehicle class
		//as they are private vehicles
		public Car(int numDoors,int maxSpeed)
		 {
			super(maxSpeed);// it will call vehicles explicit construcor first and then move ahead
		 System.out.println("Car's Constructer");
		 this.numDoors= numDoors;
	 }
	
	

}
