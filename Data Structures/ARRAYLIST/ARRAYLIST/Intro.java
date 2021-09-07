package ARRAYLIST;

import java.util.*;

public class Intro {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();// arraylist works similarly like the dynamic array with its initial array size 10
		//and once it gets completely filled it increases its size 1.5 times
		ArrayList<Integer> arr1= new ArrayList<>(5);// we can also intialise the size of the arraylist this way but once it gets completely filled it increases its size by 1.5
		
		Scanner s= new Scanner(System.in);
		arr.add(5);// adds the element int he end position of the arraylist
		arr.add(3);
		System.out.println(arr.size());// to get the no. of elements in the array list and not the capacity of the array list
		System.out.println(arr.get(1));// to get element at index 1
		arr.add(0, 8);// to set the element at 0 index as 8 and shifts all the elements right to it by 1 thus increasing the size of the arraylist
		System.out.println(arr.get(0));
		arr.set(0, 5);// to replace 5 by the element at index 0 and not increasing the size of the arraylist
		System.out.println(arr.get(0));
		
		
		

	}

}
