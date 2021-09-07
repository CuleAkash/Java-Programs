import java.util.Scanner;

public class findNode {

	public static void main(String[] args) {
		Node<Integer> head= LinkedListUse.takingInput();
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
		findNode(num,head);

	}
	
	public static void findNode(int num, Node<Integer> head)
	{
		if(head==null)
		{
			System.out.println(-1);
			return;
		}
		Node<Integer> temp= head;
		int index=1;
		while(temp!=null)
		{
			if(temp.data==num)
			{
				System.out.println(index);
				return;
			}
			temp=temp.next;
			index++;
		}
		System.out.println(-1);
	}

}
