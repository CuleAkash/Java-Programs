package bitwiseandfor;

public class incrdcr {

	public static void main(String[] args) {
		int a=60,b=60;
		//if(++a>60 && b++>60) /*first a is incremented and condition is true thats why it then checks b and both gets incremented*/
		//if(a++>60 && b++>60 )//it checks the a condition and hence when it is false it doesnt check the second condition
		//it is called short circuiting
		if(++a>60 || ++b>60)// again short circuiting happens as a condition is true and it is or with b so only one 
			//condition is needed to be true so the b condition never gets executed
		{
			System.out.println("if inside");
		}
		else
		{
			System.out.println("if outside");
		}
		
		System.out.println("a "+a + " b "+b);
	}

}
