package generics;

public class Pair<T> {// we told the class that we will tell T later, it is called generic
	private T first;
	private T second;
	
	public Pair(T first,T second)
	{
		this.first= first;
		this.second= second;
	}
	
	public void setFirst(T first)
	{
		this.first=first;
	}
	
	public T getFirst()
	{
		return this.first;
	}
	
	public void setSecond(T second)
	{
		this.second= second;
	}
	
	public T getSecond()
	{
		return this.second;
	}

}
