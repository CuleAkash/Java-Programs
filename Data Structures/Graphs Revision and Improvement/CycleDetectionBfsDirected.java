
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;



public class CycleDetectionBfsDirected {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<Integer>> adjList= DetectionCycleDirectedGraphDfs.createDirectedGraph(n, e);
        boolean isCyclePresent= checkCycleBfsDirected(adjList,adjList.size());
        System.out.println(isCyclePresent);
        s.close();
    }

    public static boolean checkCycleBfsDirected(ArrayList<ArrayList<Integer>> adjList, int size) {
        int[] indegree= new int[size];
        for(int i=0;i<size;i++){
            for(int it:adjList.get(i)){
                indegree[it]++;
            }
        }
        return checkCycleBfs(adjList, size,indegree);
    }

    private static boolean checkCycleBfs(ArrayList<ArrayList<Integer>> adjList, int size, int[] indegree) {
        Queue<Integer> q= new java.util.LinkedList<>();

        for(int i=0;i<size;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int count=0;

        while(!q.isEmpty()){
            int node= q.poll();
            count++;
            for(int it:adjList.get(node)){
                indegree[it]--;
                if(indegree[it]==0){
                    q.add(it);
                }
            }
        }
        if(count==size){
            return false;
        }
        return true;
    }
}
