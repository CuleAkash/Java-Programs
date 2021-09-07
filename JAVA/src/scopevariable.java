
public class scopevariable {

	public static void main(String[] args) {
		int i=2;

		while(i==1)
		{
	//		int i =1; //scope of a variable is the under which curly brackets it is present
			/*here i is in the main and hence it is there for all conditionals and loops 
			 * but a variable declared inside a loop will be confined to tha loop or conditional only
			 */
			
		}
		
		if(i==1)
		{
			int j=1;       /*we intialise both the j in two different conditional and it it 
			                confined to within those curly brackets and hence we can declare 
			                same variable name twice*/
		}
		else {
			int j=2;
		}
	}

}
