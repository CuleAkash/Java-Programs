package practice;

public class StudentUse2 {

	public static void main(String[] args) {
		//Student akash= new Student();// it will create a new object of name akash which whill contain all the properties of that class
		//student() is like a function but is not a function as it doesn't return anything it just creates an obejct with a copy of the properties of the classof which the 
		//object is. It is a constructer which is provided by the java Environmenment by default. although we can also create customized constructers
		
		// we can also add arguments to the constructer, but then the default constructer will be null and void.
		
		
		Student kuki= new Student("Kuki",82);// it will be constructed by a constructer which will accept arguments, so we have to form a constructer in the parent class
		// it will construct a new object kuki for which name and roll is specified, once this constructer has came into effect default constructer cant be used
		Student Akash= new Student("Akash"); // we can also create constructers which accept different arguments
		
		// the variable names akash and kuki are just references to the respective objects and not the object itself... both the objects will have all the properties of the class
		//copied into them other than the static keyword variables and functions
		System.out.println(Akash.name);// it will print "Akash"
		//System.out.println(kuki.rollNumber);// it will print 82
		System.out.println(kuki.getRoll());// it will print 82
		System.out.println(Student.getStudentnumber());// it will give the number of students in the class and as studentnumbers is a static variable it is only in the class 
		// and its copy is not made in each object hence we can access it directly by the class name
		System.out.println(Akash.getStudentnumber());// we can also do this
		//System.out.println(kuki.studentNumbers);
		// bith will give 2 as studentNumbers is a static variable and is shared by both the objects
		
	}

}
