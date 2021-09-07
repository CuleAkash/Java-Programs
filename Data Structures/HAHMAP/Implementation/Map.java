package Implementation;

import java.util.ArrayList;

public class Map<K,V> {
	ArrayList<MapNode<K, V>> buckets;
	private int size=0;//no. of elements in the arraylist
	int numBuckets;//size of the arraylist
	
	public Map() {
		buckets= new ArrayList<>();
		numBuckets=20;
		for(int i=0;i<numBuckets;i++) {
			buckets.add(null);
		}
	}
	
	public int size() {
		return this.size;
	}
	
	//to get the value of a specific key if it is present
	public V get(K key) {
		int bucketIndex= getBucketIndex(key);
		MapNode<K, V> head= buckets.get(bucketIndex);
		V value=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				value= head.value;
			}
		}
		return value;
		
	}
	
	public void remove(K key) {
		int bucketIndex= getBucketIndex(key);
		MapNode<K, V> head= buckets.get(bucketIndex);
		MapNode<K, V> prev= null;
		
		while(head!=null) {
			if(head.key.equals(key)) {
				break;
			}
			prev=head;
			head=head.next;
		}
		if(prev==null) {
			buckets.set(bucketIndex, null);
			size--;
			return;
		}
		prev.next=head.next;
		head.next=null;
		size--;
		
		
	}
	
	
	//to verify if the hashmap already contains an element
	public boolean containsKey(K key) {
		int bucketIndex= getBucketIndex(key);
		MapNode<K, V> head= buckets.get(bucketIndex);
		
		while(head!=null) {
			if(head.key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	
	
	public void insert(K key,V value) {
		int bucketIndex= getBucketIndex(key);
		MapNode<K,V> head= buckets.get(bucketIndex);
		
		//checking if the key is already present in the linked list at the bucketIndex
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
		}
		//if the key is not present in the linked list at the bucketIndex position in the array
		head= buckets.get(bucketIndex);
		MapNode<K, V> newnode= new MapNode<K,V>(key, value);
		newnode.next=head;
		buckets.set(bucketIndex, newnode);
		size++;
		
		double loadFactor= (1.0*size)/numBuckets;//when (n/b)(load factor becomes greater than 0.7 rehashing takes place which means b will be doubled
		if(loadFactor>=0.7) {
			reHash();
		}
	}


	private void reHash() {
		ArrayList<MapNode<K, V>> temp= buckets;
		buckets= new ArrayList<MapNode<K,V>>();
		
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		size=0;
		numBuckets=2*numBuckets;
		//all the entries in the old bucket is inserted into the new bucket
		for(int i=0;i<numBuckets;i++) {
			MapNode<K, V> head= temp.get(i);
			while(head!=null) {
				insert(head.key,head.value);
				head=head.next;
			}
		}
		
	}

	//finding the index in the array for the element corresponding to its hashcode
	private int getBucketIndex(K key) {
		int hc= key.hashCode();
		int index= hc%numBuckets;
		return index;
	}

}
