package Implementation;

public class MapUse {

	public static void main(String[] args) {
		Map<String, Integer> map= new Map<>();
		map.insert("abc", 2);
		map.insert("bcf", 3);
		System.out.println(map.size());
		System.out.println(map.containsKey("abc"));
		map.remove("abc");
		System.out.println(map.containsKey("abc"));
		
		System.out.println(map.size());
		

	}

}
