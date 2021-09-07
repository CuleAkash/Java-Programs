package generics;

public class PairUse {

	public static void main(String[] args) {
		Pair<String> p = new Pair<String>/*by doing this we declare that T is string type*/("akash","kuki");
		
		p.setFirst("jaiswal");
		System.out.println(p.getFirst());
		System.out.println(p.getSecond());
		
		
		Pair1<Integer,Character> p1= new Pair1<>(1,'a');// we passed an integer and a character as T and V respectively;
		
		// we we want to store a triplet only by using pair1 generic class then we have to pass a variable of pair1 class and an integer with it
		
		
		int a=10,b=20,c=15;
		
		Pair1<Integer,Integer> p3= new Pair1<>(a,b);// we formed a pair of two integers
		
		Pair1<Pair1<Integer,Integer>,Integer> p4= new Pair1<>(p3,c);// we constructed a pair with first as a pair itself and second an integer
		System.out.println(p4.getSecond());// it will print c
		System.out.println(p4.getFirst().getFirst());// this will give the first of the the p3
		System.out.println(p4.getFirst().getSecond());// will give second of p3
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Pair<Integer> i= new Pair<Integer>(1,2); // we cant declare a primitive data type to this/
		//we can only declare a subclass of the super class object
		//for int->Integer class
		// char-> Character
		// boolean-> Boolean
		
		// in this case the class pair will only take input of type int so if we want to give some input of other type and perform the same operations on them
		// we have to create another class and replace all the int by String

	}

}
