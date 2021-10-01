package OOPSBasics;

public class Cylinder {
	private double radius;
	private double height;
	
	public Cylinder(double radius,double height) {
		this.height= height;
		this.radius= radius;
	}
	
	public double lidArea() {
		return 3.14*(this.radius*this.radius);
	}
	
	public double surfaceArea() {
		return (this.lidArea())*2 + (2*3.14*this.radius*this.height);
	}
	
	public double volume() {
		return this.lidArea()*this.height;
	}



	public static void main(String[] args) {
		Cylinder cylinder= new Cylinder(3, 2);
		System.out.println(cylinder.surfaceArea());
		System.out.println(cylinder.volume());
	}


}
