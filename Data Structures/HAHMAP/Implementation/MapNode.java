package Implementation;

public class MapNode<K,V> {//MapNode will be a linked list node with two elements, kay and value corresponding to that value and a reference to the next MapNode in the list
	K key;
	V value;
	MapNode<K,V> next;
	
	public MapNode(K key, V value) {
		this.key=key;
		this.value=value;
	}

}
