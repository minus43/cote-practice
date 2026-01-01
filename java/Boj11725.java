import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj11725 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            graph[num1].add(num2);
            graph[num2].add(num1);
        }

        Queue<Integer> q = new LinkedList<>();
        int[] parent = new int[n + 1];
        boolean[] visited = new boolean[n + 1];
        visited[1] = true;
        q.offer(1);

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int next : graph[cur]) {
                if (!visited[next]) {
                    visited[next] = true;
                    parent[next] = cur;
                    q.offer(next);
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            System.out.println(parent[i]);
        }

    }
}
