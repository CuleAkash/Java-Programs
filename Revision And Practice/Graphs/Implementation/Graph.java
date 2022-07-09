package Graphs.Implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graph {


    public static List<List<Integer>> createGraph(){
        List<List<Integer>> adjList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();

        for(int i=0;i<=n;i++)
            adjList.add(new ArrayList<>());

        for(int i=1;i<=e;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        sc.close();
        return adjList;
    }

}
