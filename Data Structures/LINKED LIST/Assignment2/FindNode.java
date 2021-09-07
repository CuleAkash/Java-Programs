package Assignment2;

import java.util.Scanner;

import RecursiveLL.LinkedList;
import RecursiveLL.Node;

public class FindNode {

	public static void main(String[] args) {
		Node<Integer> head= LinkedList.createList();
		Scanner s= new Scanner(System.in);
		int k= s.nextInt();
		int index= findIndex(head,k);
		System.out.println(index);

	}
	
	public static int findIndex(Node<Integer> head, int k)
	{
		if(head==null)
		{
			return -1;
		}
		if(head.data==k)
		{
			return 0;
		}
		int smallAns= findIndex(head.next,k);
		if(smallAns==-1)
			return -1;
		return smallAns+1;
	}

}
