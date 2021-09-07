package generics;

import inheritance.Vehicle;

public class print {
	
	
	public static<T extends VehicleInterface> void print(T[] a)// it is a generic function4
	// to take input of all the types which implement vehicle interface
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		Integer[] a = new Integer[10];// we cant pass primitive data to a generic class of function
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=i+1;
		}
		
		String[] s= new String[10];
		for(int i=0;i<s.length;i++)
		{
			s[i]="abc";
		}
		
		//print(a);
		//print(s);
		
		Vehicle v[]= new Vehicle[10];
		for(int i=0;i<v.length;i++)
		{
			v[i]=new Vehicle(10);// this will give only the adress of the objects
			v[i].print();
		}
		
		
		

	}

}
