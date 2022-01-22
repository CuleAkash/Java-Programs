import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

class Pair1{
    int node;
    int weight;
    Pair1(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}


public class ShortestPathDAGWeighted {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();
        int source=s.nextInt(); 
        ArrayList<ArrayList<Pair1>> adjList= createWeightedDirectedGraph(n,e);
        
        sortestPathWeighted(adjList,adjList.size(),source);
        s.close();
    }

    public static void sortestPathWeighted(ArrayList<ArrayList<Pair1>> adjList, int size, int source) {
        Deque<Integer> stack= new ArrayDeque<>();
        int dist[]= new int[size];

        boolean[] visited= new boolean[size];

        for(int i=0;i<size;i++){
            if(!visited[i]){
                topoSort(adjList,visited,stack,i);
            }
        }
        for(int i=0;i<size;i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[source]=0;

        while(!stack.isEmpty()){
            int head= stack.remove();
            if(dist[head]!=Integer.MAX_VALUE){
                for(Pair1 it:adjList.get(head)){
                    int v= it.node;
                    int w= it.weight;
                    if(dist[head]+w<dist[v]){
                        dist[v]=dist[head]+w;
                    }
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(dist[i]+" ");
        }
    }

    private static void topoSort(ArrayList<ArrayList<Pair1>> adjList, boolean[] visited, Deque<Integer> stack, int node) {
        visited[node]=true;

        for(Pair1 i:adjList.get(node)){
            int v= i.node;
            if(!visited[v]){
                topoSort(adjList, visited,stack, v);
            }
        }
        stack.add(node);//Nodes are put inside the stack in order of their edges, such that for each u->v, u always appears before v in the stack
    }

    public static ArrayList<ArrayList<Pair1>> createWeightedDirectedGraph(int n, int e) {
        Scanner s= new Scanner(System.in);
        ArrayList<ArrayList<Pair1>> adjList= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<Pair1>());
        }

        adjList.get(0).add(new Pair1(1, 2));
        adjList.get(0).add(new Pair1(4, 1));
        adjList.get(1).add(new Pair1(2, 3));
        adjList.get(2).add(new Pair1(3, 6));
        adjList.get(4).add(new Pair1(2, 2));
        adjList.get(4).add(new Pair1(5, 4));
        adjList.get(5).add(new Pair1(3, 1));
        s.close();
        return adjList;
    }
}
