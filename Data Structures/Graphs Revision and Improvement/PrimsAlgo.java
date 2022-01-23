
import java.util.ArrayList;
import java.util.Scanner;

class WeightedNode{
    int node;
    int weight;

    WeightedNode(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}


public class PrimsAlgo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();
        ArrayList<ArrayList<WeightedNode>> adjList = createUndirectedWeightedGraph(n,e);
        primsAlgo(adjList,adjList.size());
        s.close();

    }

    //Minimum Spanning Tree ==> If we can convert a graph into tree with n nodes and n-1 edges with all nodes reachable by all other nodes is called Spanning Tree, of which the tree with min. weight values is called MST

    private static void primsAlgo(ArrayList<ArrayList<WeightedNode>> adjList, int size) {
        int key[]= new int[size];
        int parent[]= new int[size];
        boolean mstSet[]=new boolean[size];

        for(int i=0;i<size;i++){
            key[i]=Integer.MAX_VALUE;
            parent[i]=-1;
            mstSet[i]=false;
        }

        key[0]=0;
        //for n-1 edges
        for(int i=0;i<size-1;i++){
            int minValue=Integer.MAX_VALUE;
            int minIndex=0;
            //getting minimum valued index from key[]
            for(int j=0;j<size;j++){
                if(mstSet[j]==false && key[j]<minValue){
                    minIndex=j;
                    minValue=key[j];
                }
            }
            mstSet[minIndex]=true;//Added to mst

            //getting favourable edges from adjacent nodes
            for(WeightedNode it:adjList.get(minIndex)){
                if(mstSet[it.node]==false && it.weight<key[it.node]){
                    parent[it.node]=minIndex;
                    key[it.node]=it.weight;
                }
            }
        }
        for(int i=1;i<size;i++){
            System.out.println(parent[i]+"-->"+i);
        }
    }

    public static ArrayList<ArrayList<WeightedNode>> createUndirectedWeightedGraph(int n, int e) {
        ArrayList<ArrayList<WeightedNode>> adjList= new ArrayList<>();
        Scanner s= new Scanner(System.in);
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<WeightedNode>());
        }

        for(int i=1;i<=e;i++){
            int u= s.nextInt();
            int v= s.nextInt();
            int w=s.nextInt();
            
            adjList.get(u).add(new WeightedNode(v, w));
            adjList.get(v).add(new WeightedNode(u, w));
        }
        s.close();
        return adjList;
    }
}
