import java.util.ArrayList;
import java.util.Scanner;

public class BellmanFordAlgo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int e= s.nextInt();
        ArrayList<NodeJ> edges= KruskalAlgo.createGraph(n, e);//only edge are important here
        bellmanFordAlgo(edges,edges.size(),0);
        s.close();
    }

    private static void bellmanFordAlgo(ArrayList<NodeJ> edges, int size,int src) {
        int[] dist= new int[size];
        for(int i=0;i<size;i++){
            dist[i]=100000000;
        }

        dist[src]=0;

        //N-1 relaxations
        for(int i=1;i<=size-1;i++){
            for(NodeJ node:edges){
                if(dist[node.u]+node.weight<dist[node.v]){
                    dist[node.v]=dist[node.u]+node.weight;
                }
            }
        }
        //After this dist[] is the shortest dist array if no cycle

        int flag=0;//if flag=0 no negative cycle
        for(NodeJ node:edges){
            if(dist[node.u]+node.weight<dist[node.v]){
                flag=1;
                System.out.println("Negative cyle detected");
                break;
            }
        }//After extra realaxation if no changes then no negative cycle

        if(flag==0){
            System.out.println("Negative cycle is not there, The shortest distances are: ");
            for(int i=0;i<size;i++){
                System.out.print(dist[i]+" ");
            }
        }
    }
}
