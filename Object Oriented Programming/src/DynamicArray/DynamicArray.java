package DynamicArray;

public class DynamicArray {
	int[] data;// REFERENCE TO THE ARRAY
	private int lastIndex;// INDEX TO WHICH THE NEXT ELEMENT WILL BE STORED
	
	public DynamicArray()
	{
		data= new int[5];
		lastIndex=0;
	}
	
	public int size() // TO GET THE NUMBER OF ELEMENTS INT THE DYNAMIC ARRAY
	{
		return lastIndex;
	}
	
	public int get(int i) // IT WILL RETURN THE ELEMENT AT Ith INDEX
	{
		if(i>=lastIndex)
		{
			return -1;
		}
		return data[i];
	}
	
	public void set(int i, int num) // TO SET A SPECIFIC DATA AT A SPECIFIC INDEX
	{
		if(i>lastIndex)
		{
			return;
		}
		data[i]=num;
	}

	public boolean isEmpty()
	{
		return lastIndex==0;// IF THE LASTINDEX=0 THEN IT WILL RETURN TRUE OTHERWISE FALSE
	}
	
	public void add(int num)// TO ADD ELEMENT INTO THE DYNAMIC ARRAY 
	{
		if(lastIndex==data.length)// IF THE LAST INDEX IS EQUAL TO LENGTH OF THE ARRAY THEN WE HAVE TO DOUBLE THE LENGTH OF THE ARRAY
		{
			expandarray();
		}
		data[lastIndex]=num;
		lastIndex++;
		
	}
	
	
	public int removeLast()
	{
		if(lastIndex==0)
		{
			return -1;
		}
		return data[(lastIndex--)-1];
	}
	
	private void expandarray()// FUNCTION TO DOUBLE THE LENGTH OF THE ARRAY
	{
		int[] temp= data;
		data= new int[2*temp.length];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}
}
