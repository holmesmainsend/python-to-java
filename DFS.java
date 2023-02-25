import java.util.LinkedList;

public class DFS {
    public static int[][] adj_list(int n, int[][] edges) {
        int[][] graph;

        for(int[] e : edges) {
            int a = e[0];
            int b = e[1];
            
        }

        return graph;
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       int n = 5;
       int[][] edges = {{0, 1}, {0, 2}, {0, 4}, {1, 2}, {1, 3}, {2, 3}};
       int[][] graph = adj_list(n, edges);




    }
}