import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String data = sc.nextLine();
		int result = uneffectedChar(data);
		System.out.println(result);

	}
	
	public static int uneffectedChar(String dataStream){
        int ans = 0;
        String reverseStream = "";
        for(int i=dataStream.length()-1;i>=0;i--){
            reverseStream+=dataStream.charAt(i);
        }

        int index=0;
        while(index<dataStream.length()){
            if(dataStream.charAt(index)==reverseStream.charAt(index)){
                ans++;
            }
            index++;
        }
        return ans;
    }

}
