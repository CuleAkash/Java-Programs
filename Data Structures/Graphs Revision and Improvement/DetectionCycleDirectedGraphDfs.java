import java.util.ArrayList;
import java.util.Scanner;

public class DetectionCycleDirectedGraphDfs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int e= sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList= createDirectedGraph(n,e);

        boolean isCyclePresent= detectDirectedCycleDfs(adjList,adjList.size());
        System.out.println(isCyclePresent);
        sc.close();
    }

    public static ArrayList<ArrayList<Integer>> createDirectedGraph(int n, int e) {
        Scanner sc= new Scanner(System.in);
        ArrayList<ArrayList<Integer>> adjList= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int i=1;i<=e;i++){
            int u=sc.nextInt();
            int v= sc.nextInt();

            adjList.get(u).add(v);
        }
        sc.close();
        return adjList;
    }

    public static boolean detectDirectedCycleDfs(ArrayList<ArrayList<Integer>> adjList, int size) {
        boolean[] visited= new boolean[size];//visited rray to mark the overall visited elements
        boolean[] dfsVisited= new boolean[size];//visited array to mark nodes in a specific dfs check call

        for(int i=1;i<size;i++){
            if(!visited[i]){
                if(cycleCheckDfs(adjList,i,dfsVisited,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean cycleCheckDfs(ArrayList<ArrayList<Integer>> adjList, int node, boolean[] dfsVisited,
            boolean[] visited) {
        visited[node]=true;
        dfsVisited[node]=true;

        for(int i:adjList.get(node)){
            if(!visited[i]){
                if(cycleCheckDfs(adjList, i, dfsVisited, visited)){
                    return true;
                }
            }
            else if(dfsVisited[i]){
                return true;//if the node is visited in the same dfs call then cycle is there
            }
        }
        dfsVisited[node]=false;//while returning the dfsVisited is marked false to show that there is no cycle and in the next cycle node is not visited
        return false;
    }
}
