package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		
		Vehicle v= new Car(4,100);
		//v.maxSpeed;// we cant access properties wich are only in car and not in vehicle
		v.color="Red";// it is property of vehicle so it is accessible
		v.print();// this property is different fow bot car and vehicle but has the same name so it will not throw error
		// whether to implement car or vehicle print function this decision is taken during runtime 
		
		
		
		
		
		
//		Vehicle v= new Vehicle();
//		v.setColor("Red");
//		v.setMaxSpeed(100);
//		v.print();
		
		//Car c= new Car();// car class has its own property numdoors and also inherits all the vehicle class properties and functionalities
//		c.numDoors=4;
//		System.out.println(c.numDoors);
//		c.setColor("Black");
//		c.setMaxSpeed(150);
//		c.print();// both vehicle and car class has print functions but it will call the print function in car class as it first searches the child class and then 
//		//in the parent class

//		Bicycle b= new Bicycle();
//		b.setColor("Yellow");
//		b.setMaxSpeed(200);
//		b.print();
		
	//	Car Maruti = new Car(100,50);// it will print both vehicle and car constructor as when we call car constructor it will first call parent class constructor
		
	}

}
