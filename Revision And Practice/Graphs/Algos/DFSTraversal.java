package Graphs.Algos;

import java.util.ArrayList;
import java.util.List;

import Graphs.Implementation.Graph;

public class DFSTraversal {
    public static void main(String[] args) {
        List<List<Integer>> graph = Graph.createGraph();

        dfsTraversal(graph,graph.size());
    }

    private static void dfsTraversal(List<List<Integer>> graph, int size) {
        boolean[] visited = new boolean[size];
        ArrayList<Integer> storeDfs = new ArrayList<>();

        for(int i=1;i<size;i++){
            if(!visited[i])
                dfsHelper(graph,visited,i,storeDfs);
        }
    }

    private static void dfsHelper(List<List<Integer>> graph, boolean[] visited, int i, ArrayList<Integer> storeDfs) {
        storeDfs.add(i);
        visited[i] = true;

        for(int elem:graph.get(i)){
            if(!visited[elem])
                dfsHelper(graph, visited, elem, storeDfs);
        }
    }
}
