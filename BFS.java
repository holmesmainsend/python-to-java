import java.util.LinkedList;

public class BFS {

    public static LinkedList<Integer>[] adj_list(int n, int[][] edges) {
        LinkedList<Integer>[] graph = new LinkedList[n];
        for(int i = 0; i < n; i++) {
            graph[i] = new LinkedList<>();
        }

        for(int[] e : edges) {
            int a = e[0];
            int b = e[1];
            graph[a].add(b);
            graph[b].add(a);
        }

        return graph;
    }

    public static void bfs(LinkedList<Integer>[] graph, boolean[] visited) {
        Queue q = new Queue();
        q.enqueue(0);
        visited[0] = true;

        while(!q.isEmpty()) {
            int current_node = q.front();
            System.out.println(current_node);
            q.dequeue();
            int val;
            for(int i = 0; i < graph[current_node].size(); i++) {
                val = graph[current_node].get(i);
                if(visited[val] == false) {
                    q.enqueue(val);
                    visited[val] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] edges = {{0, 1}, {0, 2}, {0, 4}, {1, 2}, {1, 3}, {2, 3}};
        LinkedList<Integer>[] graph = adj_list(n, edges);
        
        boolean[] visited = new boolean[n];
        for(int i = 0; i < n; i++) {
         visited[i] = false;
        }
 
        bfs(graph, visited);
    } 
}