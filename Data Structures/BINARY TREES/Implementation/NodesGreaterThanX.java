package Implementation;

import java.util.Scanner;

public class NodesGreaterThanX {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BinaryTreeNode<Integer> root= BinaryTreeUse.takingInput();
		System.out.print("Enter the number: ");
		int x= s.nextInt();
		int count= countGreaterThanX(root,x);
		System.out.println(count);

	}

	private static int countGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if(root==null) {
		return 0;
		}
		int count=0;
		if(root.data>x)
		{
			count++;
		}
		count+=countGreaterThanX(root.left, x);
		count+=countGreaterThanX(root.right, x);
		return count;
	}

}
