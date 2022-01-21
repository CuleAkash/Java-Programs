import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPathBfsUndirected {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<Integer>> adjList= AdjListImplementation.getGraph(n, e);
        int size= adjList.size();
        int source= s.nextInt();
        getShortestPathUndirected(adjList,size,source);
        s.close();
    }

    public static void getShortestPathUndirected(ArrayList<ArrayList<Integer>> adjList, int size, int source) {
        int[] distance= new int[size];
        for(int i=0;i<size;i++){
            distance[i]=Integer.MAX_VALUE;
        }
        Queue<Integer> q= new LinkedList<>();
        distance[source]=0;
        q.add(source);

        while(!q.isEmpty()){
            int head= q.poll();
            int dist= distance[head];

            for(int i:adjList.get(head)){
                if(dist+1<distance[i]){
                    distance[i]=dist+1;
                    q.add(i);
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(distance[i]+" ");
        }
    }
}
