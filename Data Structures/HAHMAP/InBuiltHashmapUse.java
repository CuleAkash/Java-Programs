import java.util.HashMap;
import java.util.Set;

public class InBuiltHashmapUse {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap();
		map.put("abc", 2);
		map.put("def", 4);
		//to insert key value pairs into the hashmap
		
		if(map.containsKey("abc")) {
			System.out.println("true");
		}
		if(!map.containsKey("abc1")) {
			System.out.println("true");
		}
		//to verify if a key-value pair is already present in the map
		
		int v= map.get("abc");
		System.out.println(v);
		
		//int v1= map.get("abc1");
		//System.out.println(v1);
		// it will give null pointer exception as the value of the key value pair is itself an object of class Integer and as it has no value the object will point to null
		//so it will be good to check whether the key is present before getting the key value
		int v1=0;
		if(map.containsKey("abc1")) {
			v1=map.get("abc1");
		}
		System.out.println(v1);
		//as abc1 is not present in the map hence it wi9ll give the output as 0
		
		//size
		int size=map.size();
		System.out.println(size);
		
		//iterate
		Set<String> s= map.keySet();
		for(String i:s) {
			System.out.println(i);
		}
		//it returns a set with all the keys in the map
		
		
		

	}

}
