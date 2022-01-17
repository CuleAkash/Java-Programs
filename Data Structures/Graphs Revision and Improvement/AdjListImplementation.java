import java.util.ArrayList;
import java.util.Scanner;

public class AdjListImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int e= sc.nextInt();

        ArrayList<ArrayList<Integer>> adj= new ArrayList<>();

        for( int i=0;i<=n;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=1;i<=e;i++){

            int u= sc.nextInt();
            int v= sc.nextInt();

            adj.get(u).add(v);//Inserting the node connected to u to the uth arraylist
            adj.get(v).add(u);
        }


        for(int i=0;i<adj.size();i++){
            System.out.print(i+"=>");
            for(int j=0;j<adj.get(i).size();j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
        sc.close();
    }    
}

//For weighted graph

class Pair<E>{
    E node;
    int weight;

    public Pair(E node,int weight){
        this.node=node;
        this.weight=weight;
    }

    public void display(){
        System.out.print("node: "+this.node+"weight: "+this.weight);
    }
}

class WeightedAdjImplementation{
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int e= s.nextInt();

        ArrayList<ArrayList<Pair<Integer>>> adj= new ArrayList<>();

        for( int i=0;i<=n;i++){
            adj.add(new ArrayList<Pair<Integer>>());
        }

        for(int i=1;i<=e;i++){
            int u= s.nextInt();
            int v= s.nextInt();
            int weight= s.nextInt();

            adj.get(u).add(new Pair(v, weight));//Adding node as well as weight of the edge
            adj.get(v).add(new Pair(u, weight));

        }
        
        for(int i=0;i<adj.size();i++){
            System.out.print(i+"=>");
            for(int j=0;j<adj.get(i).size();j++){
               adj.get(i).get(j).display();
               System.out.print(" ");
            }
            System.out.println();
            
        }
        s.close();

    }
}
