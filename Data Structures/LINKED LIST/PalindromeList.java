
public class PalindromeList {

	public static void main(String[] args) {
		Node<Integer> head1= LinkedListUse.takingInput();
		boolean isPalindrome= checkPalindrome(head1);
		System.out.println(isPalindrome);
	}
	
	private static boolean checkPalindrome(Node<Integer> head1)
	{
		int size= LinkedListUse.length(head1);
		int mid= size/2;
		int i=1;
		Node<Integer> head2= head1;
		if(head1==null)
		{
			return true;
		}
		if(size==1)
		{
			return true;
		}
		
		while(i<mid)
		{
			head2=head2.next;
			i++;
		}
		Node<Integer> temp= head2;
		head2=head2.next;
		temp.next=null;
		head2= ReverseOfLinkedList.reverseList(head2);
		return checkPalindrome( head1,head2);
	}
	
	public static boolean checkPalindrome(Node<Integer> head1, Node<Integer> head2)
	{
		while(head1!=null && head2!=null)
		{
			if(head1.data!=head2.data)
			{
				return false;
			}
			else
			{
				head1=head1.next;
				head2=head2.next;
			}
		}
		return true;
	}

}
