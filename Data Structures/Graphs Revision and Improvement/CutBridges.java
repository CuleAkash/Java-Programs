import java.util.ArrayList;
import java.util.Scanner;

public class CutBridges {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);
        printBridges(adjList,adjList.size());
        s.close();
    }

    private static void printBridges(ArrayList<ArrayList<Integer>> adjList, int size) {
        int[] visited= new int[size];
        int[] time= new int[size];
        int lowTime[]= new int[size];

        int timer=0;
        //dfs Algo
        for(int i=0;i<size;i++){
            if(visited[i]==0){
                dfsPrintBridges(adjList,size,visited,time,lowTime,i,-1,timer);
            }
        }
        
    }

    private static void dfsPrintBridges(ArrayList<ArrayList<Integer>> adjList, int size, int[] visited, int[] time,
            int[] lowTime, int node, int parent, int timer) {

                visited[node]=1;
                time[node]=lowTime[node]=timer++;

                //for every adjacent node
                for(int it:adjList.get(node)){
                    if(it==parent)
                    continue;

                    if(visited[it]==0){
                        dfsPrintBridges(adjList, size, visited, time, lowTime, it, node, timer);
                        lowTime[node]=Math.min(lowTime[node], lowTime[it]);

                        //bridge condition
                        if(lowTime[it]>lowTime[node]){
                            System.out.println(it+" "+node);
                        }
                    }
                    else{
                        lowTime[node]=Math.min(lowTime[node],time[it]);
                    }
                }
    }
}
