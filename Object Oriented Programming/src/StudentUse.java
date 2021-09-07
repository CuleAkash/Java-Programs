
public class StudentUse {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		// s1 and s2 are the references to the two objects of class Student which have all the properties which an object of Student class will contain
		System.out.println(s1);
	//	System.out.println(s1.name+" "+s1.roll);// once we make the parameter roll private it can only be accessed within the same class
		s1.name="Akash jaiswal";// name is default hence it can be accessed in the same package in all the classes
	//	s1.roll=1;
	//	System.out.print(s1.name+" "+s1.roll);
		System.out.println(s1.getRoll());// it will give the roll no. as zero as we have not aassigned any value to it
		s1.setRoll(1);// roll no. is assigned to 1 indirectly
		System.out.println(s1.getRoll());// printing the new roll number

	}

}
