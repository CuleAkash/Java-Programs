import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class KruskalAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        ArrayList<NodeJ> adjList = createGraph(n, e);
        kruskalAlgo(adjList, adjList.size());
        s.close();

    }

    private static void kruskalAlgo(ArrayList<NodeJ> adjList, int size) {
        Collections.sort(adjList, new SortComparator());//greedily will pick the dges with least weight
        DisjointSet djs = new DisjointSet(size);

        int costMst = 0;// total cost of mst
        ArrayList<NodeJ> mst = new ArrayList<>();//to store the mst

        for (NodeJ it : adjList) {
            if (djs.getParent(it.u) != djs.getParent(it.v)) {//if the nodes not in the same component
                costMst += it.weight;
                mst.add(it);//add to mst
                djs.union(it.u, it.v);//added to same components
            }
        }

        System.out.println(costMst);
        for (NodeJ it : mst) {
            System.out.println(it.u + " " + it.v);
        }
    }

    public static ArrayList<NodeJ> createGraph(int n, int e) {
        Scanner s = new Scanner(System.in);
        ArrayList<NodeJ> adjList = new ArrayList<>();

        for (int i = 1; i <= e; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();

            adjList.add(new NodeJ(u, v, w));

        }
        s.close();
        return adjList;
    }
}

class NodeJ {
    int u;
    int v;
    int weight;

    NodeJ(int u, int v, int weight) {
        this.u = u;
        this.v = v;
        this.weight = weight;
    }
}

class SortComparator implements Comparator<NodeJ> {
    @Override
    public int compare(NodeJ node1, NodeJ node2) {
        if (node1.weight < node2.weight) {
            return -1;
        }
        if (node1.weight > node2.weight) {
            return 1;
        }
        return 0;
    }
}
