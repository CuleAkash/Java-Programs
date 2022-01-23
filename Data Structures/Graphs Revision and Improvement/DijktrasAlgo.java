import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

//Dijktra's Algorithm

class Node2 {
    int head;
    int weight;

    Node2(int Node2, int weight) {
        this.head = Node2;
        this.weight = weight;
    }

    Node2() {
    }

    // for min Priority queue

}

class SortComapre implements Comparator<Node2> {
    @Override
    public int compare(Node2 Node21, Node2 Node22) {
        if (Node21.weight < Node22.weight) {
            return -1;
        }
        if (Node22.weight < Node21.weight) {
            return 1;
        }
        return 0;
    }
}

// Dijktra's Algo is nothing but bfs like shortest path algo with pq in place of
// queue
public class DijktrasAlgo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int e = s.nextInt();
        ArrayList<ArrayList<Node2>> adjList = createWeightedUndirectedGraph(n, e);
        dijktrasAlgo(adjList, adjList.size(), 0);
        s.close();
    }

    private static void dijktrasAlgo(ArrayList<ArrayList<Node2>> adjList, int size, int source) {
        int dist[] = new int[size];
        for (int i = 0; i < size; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        dist[source] = 0;
        PriorityQueue<Node2> pq = new PriorityQueue<Node2>(size, new SortComapre());
        pq.add(new Node2(source, 0));

        while (pq.size() > 0) {
            Node2 node = pq.poll();

            for (Node2 it : adjList.get(node.head)) {
                if (dist[node.head] + it.weight < dist[it.head]) {
                    dist[it.head] = dist[node.head] + it.weight;
                    pq.add(new Node2(it.head, dist[it.head]));
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(dist[i] + " ");
        }
        
    }

    public static ArrayList<ArrayList<Node2>> createWeightedUndirectedGraph(int n, int e) {
        Scanner s = new Scanner(System.in);
        ArrayList<ArrayList<Node2>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<Node2>());
        }

        for (int i = 1; i <= e; i++) {
            int u = s.nextInt();
            int v = s.nextInt();
            int w = s.nextInt();

            adjList.get(u).add(new Node2(v, w));
            adjList.get(v).add(new Node2(u, w));
        }
        s.close();
        return adjList;
    }
}
