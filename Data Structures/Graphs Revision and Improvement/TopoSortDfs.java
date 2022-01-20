import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class TopoSortDfs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int e= sc.nextInt();

        ArrayList<ArrayList<Integer>> adjList= DetectionCycleDirectedGraphDfs.createDirectedGraph(n, e);
        Deque<Integer>  topoStack= topoSortDfs(adjList,adjList.size());
        while(!topoStack.isEmpty()){
        System.out.print(topoStack.pop()+" ");
        sc.close();
        }
        
    }

    public static Deque<Integer> topoSortDfs(ArrayList<ArrayList<Integer>> adjList, int size) {
        boolean[] visited= new boolean[size];
        Deque<Integer> topoStack= new ArrayDeque<Integer>();
        
        for(int i=0;i<size;i++){
            if(!visited[i]){
                findTopoSort(topoStack,visited,adjList,i);
            }
        }
        return topoStack;
    }

    private static void findTopoSort(Deque<Integer> st,boolean[] visited,ArrayList<ArrayList<Integer>> adjList,int node){
        visited[node]=true;

        for(int i:adjList.get(node)){
            if(!visited[i]){
                findTopoSort(st, visited, adjList, i);
            }
        }
        st.push(node);//Nodes are put inside the stack in order of their edges, such that for each u->v, u always appears before v in the stack


    }
}
