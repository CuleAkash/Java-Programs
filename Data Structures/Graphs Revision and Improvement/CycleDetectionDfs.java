import java.util.ArrayList;
import java.util.Scanner;

public class CycleDetectionDfs {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int e= sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);

        boolean isCyclePresent= dfsCycleDetection(adjList,adjList.size());
        System.out.println(isCyclePresent);
        sc.close();
    }

    public static boolean dfsCycleDetection(ArrayList<ArrayList<Integer>> adjList, int size) {
        boolean visited[]= new boolean[size];

        for(int i=1;i<size;i++){
            if(!visited[i]){
                if(dfsCycleDetectionHelper(adjList, size,i,-1,visited)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfsCycleDetectionHelper(ArrayList<ArrayList<Integer>> adjList, int size, int node, int parent,
            boolean[] visited) {
        
                visited[node]=true;

                for(int i:adjList.get(node)){
                    if(!visited[i]){
                        if(dfsCycleDetectionHelper(adjList, size,i,node,visited)){
                            return true;
                        }
                    }
                    else if(i!=parent){ 
                        return true;
                    }
                }
                return false;
    }
}

