import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckBipartiteBfs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// No of nodes
        int e = sc.nextInt();// No of edges

        ArrayList<ArrayList<Integer>> adjList = AdjListImplementation.getGraph(n, e);
        boolean isBipartiteBfs = checkBipartiteBfs(adjList, adjList.size());
        System.out.println(isBipartiteBfs);

        sc.close();
    }

    public static boolean checkBipartiteBfs(ArrayList<ArrayList<Integer>> adjList, int size) {

        int colors[]= new int[size];
        for(int i=0;i<size;i++){
            colors[i]=-1;
        }

        for(int i=1;i<size;i++){
            if(colors[i]==-1){
                if(!checkBfs(adjList,colors,i)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkBfs(ArrayList<ArrayList<Integer>> adjList, int[] colors, int node) {
        Queue<Integer> pendingNodes= new LinkedList<>();

        pendingNodes.add(node);
        colors[node]=1;

        while(!pendingNodes.isEmpty()){
            int head= pendingNodes.poll();
            for(int i:adjList.get(head)){
                if(colors[i]==-1){
                    colors[i]=1-colors[head];
                    pendingNodes.add(i);
                }
                else if(colors[i]==colors[head]){
                    return false;
                }
            }
        }
        return true;
    }
}
