package twoDarrays;

public class Store2Darray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4}/*elements of first row*/,{5,6,7,8}/*elements of second row*/,{9,10,11,12}/*elements of third row*/};
		//each row is a separate array and so 2D array is an array of arrays
		// arr[0] will have the reference for elements in the first row
		// similarly arr[1] will have 2nd and arr[2] has 3rd row references respectively
		// and the reference  of array containing arr[0], arr[1] and arr[2] will be stored in arr
		System.out.println(arr.length);// this will give three as their are three rows and hence three different array references are in arr
		System.out.println(arr[0].length);// this will give column length as it will givr the length of first row array

	}

}
