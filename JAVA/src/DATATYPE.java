
public class DATATYPE {

	public static void main(String[] args) {
		char c= 'a';
		int i=10;
		System.out.println(c+3);//if we print c+3 it will give the ASCII value of c+3
		//char b= c+i;//i is int and cant be stored in char variable b
		//double d;
		//float f=d;//a double value cant be stored in float as double>float
		//d=f;//it can happen as double >float
		
		//float j=2.5; /*decimal value is first stored in a double temporary memory location
	//	and then it is converted into binary form there and hence cant be then stored in float*/
		
	//	 j=2.5f;//we told the compiler to take the temporary memory location as float so it is feasible
		 
		// long l= 123456789123456789;//integer is temporary stored in int memory size after conerting into binary so not feasible
		// l= 1234567890123456l; //told the system to take l size temporary file
		
		 short s=12;
		// b = (char)(c+i);//ex[plicitly we typecasted c+i integer into char 
		// f = (float)d;// explicitly we type casted double d into float variable but some data will be lost
		 
	}

}
