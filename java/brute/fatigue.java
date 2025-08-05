class Solution {
    boolean[] visited;
    int count = -1;

    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        visited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        answer = count;
        return answer;
    }

    public void dfs(int[][] dungeons, int fatigue, int depth) {
        if (count < depth) {
            count = depth;
        }
        for (int i = 0; i < dungeons.length; i++) {
            int minFatigue = dungeons[i][0];
            int costFatigue = dungeons[i][1];
            if (!visited[i] && fatigue >= minFatigue) {
                visited[i] = true;
                dfs(dungeons, fatigue - costFatigue, depth + 1);
                visited[i] = false;
            }

        }
    }
}