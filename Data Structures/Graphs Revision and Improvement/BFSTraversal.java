
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//Bfs traversal=> Breadth first traversal, Adjacent nodes are traversed first

public class BFSTraversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int e= sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);
        ArrayList<Integer> ans= bfsTraversal(adjList,adjList.size());

        for(int i:ans){
            System.out.println(i);
        }
        sc.close();

    }

    public static ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList, int size) {
       ArrayList<Integer> ans = new ArrayList<>();//arraylist for the traversal result
       boolean visited[]= new boolean[size];//visited array for tracking
       for(int i=1;i<size;i++){
        if(!visited[i]){//apply traversal if node is un visited, disjoint graphs keeping in mind so no node gets unvisited
            ArrayList<Integer> smallAns= (bfsTraversalHelper(adjList,visited,size,i));//traversal result for one particular node
            ans.addAll(smallAns);
        }
       }
       return ans;
    }

    private static ArrayList<Integer> bfsTraversalHelper(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, int size, int i) {
        Queue<Integer> pendingNodes= new LinkedList<>();
        ArrayList<Integer> ans= new ArrayList<>(); 

        pendingNodes.add(i);//add first node to queue
        visited[i]=true;//mark as visited so never added again to queue

        while(!pendingNodes.isEmpty()){
            int head= pendingNodes.poll();//pop the top element
            ans.add(head);//add to traversal result

            for(int j:adjList.get(head)){//get all the adjacent nodes of the head node
                if(!visited[j]){//if the adjacent nodes are not visited yet put them to queue and mark them as visited
                    pendingNodes.add(j);
                    visited[j]=true;
                }
            }

        }
        //when queue is empty traversal is complete
        return ans;

        
    }
}
