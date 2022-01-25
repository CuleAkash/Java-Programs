import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

/**
 * Kosaraju Algorithm is used to find strongly connected components,i.e. in that component all the nodes can be accessed by all other nodes in the Directed Graph
 * Kosaraju Algo works in three steps:
 * 1. Sort the graph nodes in the order of their time of visit, it can be done by doing topo Sort
 * 2. Transpose the Graph edges
 * 3. Do normal dfs call according to the topological sorted graph nodes,and elements traversed in the same dfs call are in the same Strongly connected component
 */


public class KosarajuAlgo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int e=s.nextInt();
        ArrayList<ArrayList<Integer>> adjList= createDirectedGraph(n,e,s);
        kosarajuAlgo(adjList,adjList.size());
    }

    private static void kosarajuAlgo(ArrayList<ArrayList<Integer>> adjList, int size) {
        //Step 1
        boolean[] visited= new boolean[size];
        Deque<Integer> topoStack= new ArrayDeque<>();//adding and removing from last, using this as a stack
        for(int i=0;i<size;i++){
            if(!visited[i]){
                topoSortDfs(adjList,visited,topoStack,i);
            }
        }
        //Step 2
        ArrayList<ArrayList<Integer>> transpose= new ArrayList<>();
        for(int i=0;i<size;i++){
            transpose.add(new ArrayList<>());
        }

        for(int node=0;node<size;node++){
            visited[node]=false;
            for(int adj:adjList.get(node)){
                transpose.get(adj).add(node);
            }
        }
        //Step 3
        for(int i=0;i<size;i++){
            int node=topoStack.peekLast();
            topoStack.removeLast();
            if(!visited[node]){
                if(node==0){
                    continue;
                }
                System.out.print("SCC: ");
                revDfs(transpose,visited,node);
                System.out.println();
            }
        }
    }

    private static void revDfs(ArrayList<ArrayList<Integer>> transpose, boolean[] visited, int node) {
        visited[node]=true;
        System.out.print(node+" ");//adding to the SCC
        for(int it:transpose.get(node)){
            if(!visited[it]){
                revDfs(transpose, visited, it);
            }
        }
    }

    private static void topoSortDfs(ArrayList<ArrayList<Integer>> adjList, boolean[] visited, Deque<Integer> topoStack,
            int node) {
                visited[node]=true;
                for(int it:adjList.get(node)){
                    if(!visited[it]){
                        topoSortDfs(adjList, visited, topoStack, it);
                    }
                }
                topoStack.offerLast(node);
    }

    private static ArrayList<ArrayList<Integer>> createDirectedGraph(int n, int e, Scanner s) {
        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=1;i<=e;i++){
            int u=s.nextInt();
            int v=s.nextInt();

            adjList.get(u).add(v);
        }
        return adjList;
    }
}
