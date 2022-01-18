import java.util.ArrayList;
import java.util.Scanner;

//In dfs traversal we go to the maximum depth of each node and then call recursion for adjecent in the same way


public class DFSTraversal {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int e= sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);
        ArrayList<Integer> ans= dfsTraversal(adjList,adjList.size());

        for(int i:ans){
            System.out.print(i+" ");
        }
        sc.close();
    }

    public static ArrayList<Integer> dfsTraversal(ArrayList<ArrayList<Integer>> adjList, int size) {
        ArrayList<Integer> storeDfs= new ArrayList<>();//arraylist to store traversal result
        boolean[] visited= new boolean[size];//visited array

        for(int i=1;i<size;i++){//to take tare of connected components
            if(!visited[i]){//if not visited dfs is called
                dfsTraversalHelper(storeDfs,visited,adjList,i);
            }
        }
        return storeDfs;
    }

    private static void dfsTraversalHelper(ArrayList<Integer> storeDfs, boolean[] visited,
            ArrayList<ArrayList<Integer>> adjList, int node) {
                //dfs is a recursive technique in which we call the recursive function for all adjacent nodes to reach the depth of  a particular node
                storeDfs.add(node);//added to dfs result
                visited[node]=true;//visited

                for(int i:adjList.get(node)){
                    if(!visited[i]){//if not visited recursion is called
                    dfsTraversalHelper(storeDfs, visited, adjList, i);
                    }
                }
    }
}
