import java.util.ArrayList;
import java.util.Scanner;


public class CutVertex {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);
        printArtPoint(adjList,adjList.size());//Articulation points are points whose removal will cause the graph to break into 2 or more components
        s.close();
    }

    private static void printArtPoint(ArrayList<ArrayList<Integer>> adjList, int size) {
        int[] visited= new int[size];
        int[] time= new int[size];
        int[] lowTime= new int[size];
        int[] isArtPoint= new int[size];//to get only unique points
        int timer=0;
        //call dfs
        for(int i=0;i<size;i++){
            if(visited[i]==0){
                dfsgetArtPoints(adjList,size,visited,time,lowTime,isArtPoint,i,-1,timer);
            }
        }

        for(int i:isArtPoint){
            System.out.print(i+" ");
        }
    }

    private static void dfsgetArtPoints(ArrayList<ArrayList<Integer>> adjList, int size, int[] visited, int[] time,
            int[] lowTime, int[] isArtPoint, int node, int parent, int timer) {

                visited[node]=1;
                time[node]=lowTime[node]=timer++;
                int child=0;

                for(int it:adjList.get(node)){
                    if(parent==it){
                        continue;
                    }
                    //for unvisited adjacent points
                    if(visited[it]==0){
                        dfsgetArtPoints(adjList, size, visited, time, lowTime, isArtPoint, it, node, timer);
                        lowTime[node]=Math.min(lowTime[node],lowTime[it]);//time upto which it can go back

                        //Articulation point condition
                        if(lowTime[it]>=time[node] && parent!=-1){
                            isArtPoint[node]=1;
                        }
                        child++;
                    }
                    else{
                        lowTime[node]=Math.min(lowTime[node],time[it]);
                    }
                }
                //special case when 1 node has two or more individual children
                if(parent==-1 && child>1){
                    isArtPoint[node]=1;
                }
    }
}
