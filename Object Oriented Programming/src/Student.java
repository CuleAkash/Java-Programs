
public class Student {

	String name;// to include name of all the objects of the class Student
	private int roll;// to include roll no.
	
	
	public int getRoll()// functionality to return the roll no for an object in some other class as roll is a private parameter and cant be accessed outside this class
	{
		return this.roll;
	}
	
	public void setRoll(int roll)
	{
		this.roll=roll;// this keyword effectively specifies the the object for which the function is called
	}

	}


