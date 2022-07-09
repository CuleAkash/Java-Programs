package Graphs.Algos;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Graphs.Implementation.Graph;

public class BFSTraversal {
    public static void main(String[] args) {
        List<List<Integer>> graph = Graph.createGraph();

        dfsTraversal(graph,graph.size());
    }

    private static void dfsTraversal(List<List<Integer>> graph, int n) {
        boolean[] visited = new boolean[n];

        for(int i=1;i<n;i++){
            if(!visited[i])
                bfsHelper(graph,visited,i);
        }
    }

    private static void bfsHelper(List<List<Integer>> graph, boolean[] visited, int i) {
        visited[i] = true;

        Queue<Integer> pendingNodes = new LinkedList<>();

        pendingNodes.add(i);

        while(!pendingNodes.isEmpty()){
            int top = pendingNodes.poll();
            System.out.print(top+" ");
            for(int elem:graph.get(top)){
                if(!visited[elem]){
                    pendingNodes.add(elem);
                    visited[elem] = true;
                }
            }
        }
    }
}
