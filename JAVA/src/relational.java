
public class relational {

	public static void main(String[] args) {
		// relational operators will always give the output in boolean either true or false
		
		int a=10, b=12;
		System.out.println(a>b); //give false as a<b
		System.out.println(a<b); //give true as a>b
		System.out.println(a==b); //give false
		 //a=b is assigning value of b into a
		// a==b is checking whether a and b are equal and will give true of false accordingly
		System.out.println(a>=b);
		System.out.println(a<=b);
		
		System.out.println(a>10 && b>10 ); //it will give false as both are false
		System.out.println(a==10 || b<10); // it will give true as one condition is true
		System.out.println(true); // it will also give true
		System.out.println(!true); //it will give false as it will negate the true condition
		System.out.println(!(a>b)); //it will give true as a!>b and will give false and then that false is negated
		
		

	}

}
