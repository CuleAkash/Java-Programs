package generics;

public class Pair1<T,V> {// we can also form a generic class which will take two diff. data types as input
	private T first;
	private V second;
	
	public Pair1(T first,V second)
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
	
	public void setSecond(V second)
	{
		this.second= second;
	}
	
	public V getSecond()
	{
		return this.second;
	}

}
