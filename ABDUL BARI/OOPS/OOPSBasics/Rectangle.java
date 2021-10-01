package OOPSBasics;

public class Rectangle {
	private double length;
	private double breadth;
	//As I have made these private they can't be accessed outside this class upon an object
	
	
	//getters and setters methods
	public double getLength() {
		return this.length;
	}
	
	public double getBreadth() {
		return this.breadth;
	}
	
	public void setLength(double length) {
		if(length>=0) {
			this.length=length;
		}
	}
	
	public void setBreadth(double breadth) {
		if(breadth>=0) {
			this.breadth=breadth;
		}
	}
	
	
	
	
	public Rectangle(double length, double breadth) {
		this.length= length;
		this.breadth= breadth;
	}
	
	public double area() {
		return this.length*this.breadth;
	}
	
	public double perimeter() {
		return 2*(this.length+this.breadth);
	}
}
