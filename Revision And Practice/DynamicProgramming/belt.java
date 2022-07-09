package DynamicProgramming;

import java.util.*;
class Solution
{
    static void soln(int n, int m, String[][] matrix, int number, String toFindAns)
    {
        Deque<String> queue
            = new LinkedList<String>();
            boolean leftToRight= true;
             for(int i=0; i<m; i++)
    {
        
        if(leftToRight){
            for(int j=0; j<n; j++){
                queue.addLast(matrix[i][j]);
            }
        }
        else{
            for(int j=n-1; j>=0; j--){
                queue.addLast(matrix[i][j]);
            }
        }
        leftToRight= !leftToRight;
    }
    
      while(number>0){
        String temp= queue.removeLast();
        queue.addFirst(temp);
        number--;
    }
    
     String matrix2[][]=new String[m][n];
       leftToRight= true;
    for(int i=0; i<m; i++)
    {
       
        if(leftToRight){
            for(int j=0; j<n; j++){
                matrix2[i][j]= queue.peek();
                queue.removeFirst();
            }
        }
        else{
            for(int j=n-1; j>=0; j--){
                matrix2[i][j]=queue.peek();
                queue.removeFirst();
            }
        }
        leftToRight= !leftToRight;
    }   
        show(m,n,toFindAns,matrix2);
    }

    static void show(int m, int n, String toFindAns, String[][] matrix2)
    {
          
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
            System.out.print(matrix2[i][j]+" ");
        }
        System.out.println();
    }
    
     boolean flag= false;
    for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(matrix2[i][j].equals(toFindAns)){
                System.out.print("["+i+", "+j+"]");
                flag= true;
                break;
            }
            
        }
    }

    if(!flag)
        System.out.print("Not Available");
    }
}
class FoodBelt
{
	public static void main (String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int m=scanner.nextInt();
		int n=scanner.nextInt();
		String matrix[][]=new String[m][n];
		
		  for(int i=0; i<m; i++)
    {
        for(int j=0; j<n; j++)
        {
             String str=scanner.next();
           matrix[i][j]=str;
        }
    }
    
   int number=scanner.nextInt();
   String toFindAns=scanner.next();
   Solution.soln(n,m,matrix,number,toFindAns);
}
}