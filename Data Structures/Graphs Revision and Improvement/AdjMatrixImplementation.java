import java.util.Scanner;

//In this implementattion we create a matrix and set values 1 where the nodes are connect but from both ends
public class AdjMatrixImplementation {
    public static void main(String[] args) {
        
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();//number of nodes
        int e= s.nextInt();//number of edges

        int[][] adjMatrix= new int[n+1][n+1];

        for( int i=1;i<=e;i++){
            int u= s.nextInt();//first node
            int v= s.nextInt();//Second node

            adjMatrix[u][v]=1;//First connection between u and v
            adjMatrix[v][u]=1;//connection between v and u
        }
        for(int i=0;i<adjMatrix.length;i++){
            for( int j=0;j<adjMatrix.length;j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
        s.close();

    }
}
