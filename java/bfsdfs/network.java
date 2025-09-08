class Solution {
    boolean[] visited;

    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, computers, n);
                answer++;
            }
        }
        return answer;
    }

    public void dfs(int node, int[][] computers, int n) {
        visited[node] = true;

        for (int j = 0; j < n; j++) {
            if (computers[node][j] == 1 && !visited[j]) {
                dfs(j, computers, n);
            }
        }
    }
}