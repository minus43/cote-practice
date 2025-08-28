class Solution {
    public int solution(int m, int n, int[][] puddles) {
        final int MOD = 1_000_000_007;

        // WIDTH=m(가로=x 최대), HEIGHT=n(세로=y 최대)
        int WIDTH = m, HEIGHT = n;

        // water[y][x] = (x,y)가 물인지 여부
        boolean[][] water = new boolean[HEIGHT + 1][WIDTH + 1];
        for (int[] p : puddles) {
            int x = p[0];
            int y = p[1];
            if (1 <= x && x <= WIDTH && 1 <= y && y <= HEIGHT) {
                water[y][x] = true;
            }
        }

        // 시작/도착이 물이면 경로 0
        if (water[1][1] || water[HEIGHT][WIDTH])
            return 0;

        // dp[y][x] = (1,1)에서 (x,y)까지 경로 수
        int[][] dp = new int[HEIGHT + 1][WIDTH + 1];
        dp[1][1] = 1;

        for (int y = 1; y <= HEIGHT; y++) {
            for (int x = 1; x <= WIDTH; x++) {
                if (y == 1 && x == 1)
                    continue; // 시작점은 이미 1
                if (water[y][x]) { // 물이면 경로 0
                    dp[y][x] = 0;
                } else {
                    long fromUp = dp[y - 1][x]; // (x, y-1) → 아래
                    long fromLeft = dp[y][x - 1]; // (x-1, y) → 오른쪽
                    dp[y][x] = (int) ((fromUp + fromLeft) % MOD);
                }
            }
        }

        return dp[HEIGHT][WIDTH];
    }
}
