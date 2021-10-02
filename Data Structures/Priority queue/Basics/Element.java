package Basics;

public class Element<E> {
	E value;
	int priority;
	
	public Element(E value, int priority) {
		this.priority=priority;
		this.value= value;
	}

}
