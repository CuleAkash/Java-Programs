import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;



//Dijktra's Algorithm

class Node implements Comparator<Node>{
    int node;
    int weight;
    Node(int node,int weight){
        this.node=node;
        this.weight=weight;
    }

    Node(){}

    //for min Priority queue
    @Override
    public int compare(Node node1,Node node2){
        if(node1.weight<node2.weight){
            return -1;
        }
        if(node2.weight<node1.weight){
            return 1;
        }
        return 0;
    }
}

//Dijktra's Algo is nothing but bfs like shortest path algo with pq in place of queue
public class DijktrasAlgo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<Node>> adjList= createWeightedUndirectedGraph(n,e);
        dijktrasAlgo(adjList,adjList.size(),0);
    }

    private static void dijktrasAlgo(ArrayList<ArrayList<Node>> adjList, int size, int source) {
        int dist[]= new int[size];
        for(int i=0;i<size;i++){
            dist[i]=Integer.MAX_VALUE;
        }

        dist[source]=0;
        PriorityQueue<Node> pq= new PriorityQueue<Node>(size,new Node());
        pq.add(new Node(source,0));

        while(pq.size()>0){
            Node head= pq.poll();

            for(Node it:adjList.get(head.node)){
                if(dist[head.node]+it.weight<dist[it.node]){
                    dist[it.node]=dist[head.node]+it.weight;
                    pq.add(new Node(it.node,dist[it.node]));
                }
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(dist[i]+" ");
        }
    }

    public static ArrayList<ArrayList<Node>> createWeightedUndirectedGraph(int n, int e) {
        Scanner s= new Scanner(System.in);
        ArrayList<ArrayList<Node>> adjList= new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<Node>());
        }

        for(int i=1;i<=e;i++){
            int u= s.nextInt();
            int v= s.nextInt();
            int w= s.nextInt();

            adjList.get(u).add(new Node(v,w));
            adjList.get(v).add(new Node(u, w));
        }
        return adjList;
    }
}
