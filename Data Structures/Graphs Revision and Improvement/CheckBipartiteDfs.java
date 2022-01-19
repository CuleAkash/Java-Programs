import java.util.ArrayList;
import java.util.Scanner;

public class CheckBipartiteDfs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int e= sc.nextInt();
        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);

        boolean isBipartite= dfsCheckBipartite(adjList,adjList.size());
        System.out.println(isBipartite);
        sc.close();
    }

    public static boolean dfsCheckBipartite(ArrayList<ArrayList<Integer>> adjList, int size) {
        int colors[]= new int[size];
        for(int i=0;i<size;i++){
            colors[i]=-1;
        }

        for(int i=1;i<size;i++){
            if(colors[i]==-1){
                if(!checkDfs(adjList,colors,i)){
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkDfs(ArrayList<ArrayList<Integer>> adjList, int[] colors, int node) {
        //For frist node colors[node]=-1 but not for other nodes in recursive call
        if(colors[node]==-1){colors[node]=1;}
        for(int i:adjList.get(node)){
            if(colors[i]==-1){
                colors[i]=1-colors[node];
                if(!checkDfs(adjList, colors, i)){
                    return false;
                }
            }
            else if(colors[i]==colors[node]){
                return false;
            }
        }
        return true;

    }
}
