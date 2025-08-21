import java.util.*;

class Solution {
    static class DSU {
        int[] parent, rank;
        DSU(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) parent[i] = i;
        }
        int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]); // 경로 압축
            return parent[x];
        }
        boolean union(int a, int b) {
            int pa = find(a), pb = find(b);
            if (pa == pb) return false; // 이미 같은 집합 → 사이클
            if (rank[pa] < rank[pb]) {
                parent[pa] = pb;
            } else if (rank[pa] > rank[pb]) {
                parent[pb] = pa;
            } else {
                parent[pb] = pa;
                rank[pa]++;
            }
            return true;
        }
    }

    public int solution(int n, int[][] costs) {
        // 1) 비용 기준 오름차순 정렬
        Arrays.sort(costs, Comparator.comparingInt(e -> e[2]));

        DSU dsu = new DSU(n);
        int used = 0, answer = 0;

        // 2) 비용이 싼 간선부터 사이클 안 생기면 채택
        for (int[] e : costs) {
            if (dsu.union(e[0], e[1])) {
                answer += e[2];
                if (++used == n - 1) break; // MST 완성
            }
        }
        return answer;
    }
}
