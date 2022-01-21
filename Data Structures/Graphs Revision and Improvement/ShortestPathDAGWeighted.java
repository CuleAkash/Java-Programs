import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class Pair{
    int node;
    int weight;
    Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}


public class ShortestPathDAGWeighted {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<Pair>> adjList= createWeightedDirectedGraph(n,e);
        int source=s.nextInt(); 
        sortestPathWeighted(adjList,adjList.size(),source);
    }

    public static void sortestPathWeighted(ArrayList<ArrayList<Pair>> adjList, int size, int source) {
        Deque<Pair> stack= new ArrayDeque<>();
        int dist[]= new int[size];

        boolean[] visited= new boolean[size];

        for(int i=0;i<size;i++){
            if(!visited[i]){
                topoSort(adjList,visited,stack,i);
            }
        }
        dist[source]=0;

        while(!stack.isEmpty()){
            Pair head= stack.remove();
        }
    }

    private static void topoSort(ArrayList<ArrayList<Pair>> adjList, boolean[] visited, Deque<Pair> stack, Pair node) {
        visited[node.]=true;

        for(Pair i:adjList.get(node)){
            int v= i.node;
            if(!visited[v]){
                topoSort(adjList, visited,stack, v);
            }
        }
        stack.add(node);//Nodes are put inside the stack in order of their edges, such that for each u->v, u always appears before v in the stack
    }

    public static ArrayList<ArrayList<Pair>> createWeightedDirectedGraph(int n, int e) {
        Scanner s= new Scanner(System.in);
        ArrayList<ArrayList<Pair>> adjList= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<Pair>());
        }

        for(int i=1;i<=e;i++){
            int u=s.nextInt();
            int v=s.nextInt();
            int w= s.nextInt();

            adjList.get(u).add(new Pair(v,w));
        }
        return adjList;
    }
}
