
import java.util.Scanner;

public class DisjointSet {
    int[] parent=new int[1000];
    int rank[]=new int[1000];

    DisjointSet(int n){
        makeSet(n);
    }

    private void makeSet(int n) {
        for(int i=0;i<=n;i++){
            parent[i]=i;
            rank[i]=0;
        }
    }

    //Get parent method
    int getParent(int node){
        if(parent[node]==node){
            return node;
        }
        return parent[node]=getParent(parent[node]);

    }
    //3->4->6->1 here the recursive call will be made to 6 and when its parent 1 is got we assign it to all nodes in the chain as parent, Path compressing

    void union(int node1,int node2){
        int node1Par= getParent(node1);
        int node2Par= getParent(node2);

        if(rank[node1Par]<rank[node2Par]){
            parent[node1Par]=node2Par;
        }
        else if(rank[node1Par]>rank[node2Par]){
            parent[node2Par]=node1Par;
        }
        else{
            parent[node2Par]=node1Par;
            rank[node1Par]++;
        }//Union by rank
    }
}


class DisjointSetUse{
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        DisjointSet djs= new DisjointSet(n);
        int u=s.nextInt();
        while(u!=0){
            int node1=s.nextInt();
            int node2=s.nextInt();
            djs.union(node1, node2);
            u--;
        }
        // for(int i:djs.parent){
        //     System.out.println(i);
        //     System.out.println(djs.rank.get(i));
        // }
        for(int i=1;i<=7;i++){
            System.out.println(i+": parent =>"+djs.getParent(i));
        }
        s.close();
    }
}
