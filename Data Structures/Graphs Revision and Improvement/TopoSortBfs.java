import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//kahn's Algorithm is used here
public class TopoSortBfs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();

        ArrayList<ArrayList<Integer>> adjList= DetectionCycleDirectedGraphDfs.createDirectedGraph(n, e);
        int[] topo= bfsTopoSort(adjList,adjList.size());

        for(int i=0;i<topo.length;i++){
            System.out.print(topo[i]+" ");
        }
        s.close();
    }

    public static int[] bfsTopoSort(ArrayList<ArrayList<Integer>> adjList, int size) {
        int indegree[]= new int[size];
        for(int i=0;i<size;i++){
            for(int j:adjList.get(i)){
                indegree[j]++;
            }
        }
        return topoSort(adjList,size,indegree);
    }

    private static int[] topoSort(ArrayList<ArrayList<Integer>> adjList,int size,int[] indegree){
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<size;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }

        int[] topo= new int[size];//sort array
        int index=0;
        while(!q.isEmpty()){
            int head=q.poll();
            topo[index++]=head;
            for(int i:adjList.get(head)){
                indegree[i]--;
                if(indegree[i]==0){
                    q.add(i);
                }
            }

        }
        return topo;
    }

    

}
