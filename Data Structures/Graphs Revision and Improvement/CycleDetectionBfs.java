import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class CyclePair{
    int node;
    int parent;

    public CyclePair(int node, int parent){
        this.node=node;
        this.parent=parent;
    }
}

public class CycleDetectionBfs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();//No. of nodes
        int e= s.nextInt();//No. of edges

        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);//Adjacency list

        boolean isCyclePresent= bfsCycleDetect(adjList,adjList.size());
        System.out.println(isCyclePresent);

        s.close();
    }

    public static boolean bfsCycleDetect(ArrayList<ArrayList<Integer>> adjList, int size) {
        boolean[] visited= new boolean[size];//visited array to get track of all visited elements

        //To take care of connected components
        for(int i=1;i<size;i++){
            if(!visited[i]){//calling the function for cycle detection for each unvisited node 
                if(bfsCycleDetectHelper(adjList, size,visited,i)){
                    return true;
                }
            }
        }
        return false;
        
    }

    private static boolean bfsCycleDetectHelper(ArrayList<ArrayList<Integer>> adjList, int size, boolean[] visited,
            int head) {
                Queue<CyclePair> pendingNodes= new LinkedList<>();//queue to perform bfs
                pendingNodes.add(new CyclePair(head, -1));//adding first node to queue
                visited[head]=true;//mark the first node

                while(!pendingNodes.isEmpty()){
                    int node= pendingNodes.peek().node;
                    int parent= pendingNodes.peek().parent;
                    pendingNodes.remove();

                    //When one node is removed from the queue we check if its adjacent node is visited and not equal to its parent then there is a cycle
                    for(int i:adjList.get(node)){
                        if(!visited[i]){//if not visited we put the adjacent node into the queue
                            pendingNodes.add(new CyclePair(i, node));
                            visited[i]=true;
                        }
                        else if(i!=parent){//if visited and not is parent then cycle is detected
                            return true;
                        }
                    }
                }
                return false;
    }
}

