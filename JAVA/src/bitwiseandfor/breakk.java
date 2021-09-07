package bitwiseandfor;

public class breakk {

	public static void main(String[] args) {
		int n=5;
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i==j)
				{
					break;//it makes the code to just break out of the immediate loop and not the whole entire loop
					//just like in this case it made the code to break out of the j loop only and not i loop
					//it starts the printing from line 2 as in the first line i=j and the loop breaks 
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
