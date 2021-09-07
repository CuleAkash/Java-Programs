import java.util.HashMap;
import java.util.Scanner;

public class ExtraUniqueCharacters {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String input= s.next();
		uniqueChar(input);

	}

	private static void uniqueChar(String input) {
		if(input.length()==0) {
			return;
		}
		
		HashMap<Character, Boolean> map= new HashMap<>();
		
		for(int i=0;i<input.length();i++) {
			Character ch= input.charAt(i);
			
			if(!map.containsKey(ch)) {
				System.out.print(ch);
				map.put(ch, true);
			}
		}
		
	}

}
