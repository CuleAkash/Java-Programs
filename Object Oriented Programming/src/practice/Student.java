package practice;

public class Student {
	
	String name;
	 private int rollNumber;
	final public static double CONVERSIONRATE= 0.95;//final->specifies that the value of this variable is set only once and then can never be changed
	//static-> value is shared by all the objects and the copy of this variable is not constructed everytime an object is constructed
	 private static int studentNumbers;// student number is a variable that lies only within this class and shared by all the class objects
	 
	 Student(String name,int rollNumber)// this will take the name and roll both
	 {
		 this.name= name;
		 studentNumbers++;
		 this.rollNumber= rollNumber;
	 }
	 Student(String name)// this constructer will only take name as argument	 {
	 { this.name= name;
	 studentNumbers++;
	 }
	 
	 
	//NOTE: final static variables can be considered as constants 
	 
	 
	 public static int getStudentnumber()// to get the number of students
	 {
		 return studentNumbers;
	 }
	 
	 
	 public void setRoll(int rollNumber)// it is public so it can be accessed anywhere
	 {
		 this.rollNumber=rollNumber;// (this)keyword specifies that which object it is concerned about
	 }
	 int getRoll()// it is a default function so it can be accessed within this package only
	 {
		 return this.rollNumber;
	 }
}
