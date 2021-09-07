package ARRAYSandSTRINGS;

import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			System.out.println("Enter the two strings:"); // taking two string inputs
			String str1 = s.next();
			String str2= s.next();
			boolean isPermutation = check_permutation(str1,str2);
			System.out.println(isPermutation);

		}
		
		public static boolean check_permutation(String str1,String str2)
		{
			if(str1.length()!=str2.length()) // if both string lengths are unequal they cant be permutation of each other
			{
				return false;
			}
			boolean pert = false;
			int size = str1.length();
			int[] arr1= new int[size]; // converting the strings into integer arrays i.e. their ascii values will get stored in the arrays
			int[] arr2 = new int[size];
			for(int k=0;k<size;k++)
			{
				arr1[k]= str1.charAt(k);
				arr2[k]= str2.charAt(k);
			}
			
			for(int i=0;i<size;i++) // checking if the integer(char) in first array exist in the second array
			{
				pert=false;// intitializing it false form each first array iteration to show that its match is not yet found
				for(int j=0;j<size;j++)
				{
					if(arr1[i]==arr2[j])
					{
						pert = true;// once match is found it is assigned true
						arr2[j]= Integer.MIN_VALUE; // once an element is found, to make it un foundable assign an illogical value
						break; // to prevent matching one element of first array to any other element of second array
					}
				}
				if(pert==false)// even after comparing all the elements of second array if it is still false return false
				{
					return false;
				}
			}
			return true;//if the last element is also found it is true at the end
		}

	}


