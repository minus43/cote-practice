import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj10026 {
    static int N;
    static char[][] map;
    static boolean[][] visited;

    // 4방향
    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new char[N][N];

        for (int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        // 1) 일반인 구역 수 계산
        visited = new boolean[N][N];
        int normal = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfsNormal(i, j, map[i][j]);
                    normal++;
                }
            }
        }

        // 2) 색약 구역 수 계산
        visited = new boolean[N][N];
        int blind = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    dfsBlind(i, j, map[i][j]);
                    blind++;
                }
            }
        }

        System.out.println(normal + " " + blind);
    }

    // 일반 DFS
    static void dfsNormal(int x, int y, char color) {
        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                continue;

            if (!visited[nx][ny] && map[nx][ny] == color) {
                dfsNormal(nx, ny, color);
            }
        }
    }

    // 색약 DFS (R == G 취급)
    static void dfsBlind(int x, int y, char color) {
        visited[x][y] = true;

        for (int k = 0; k < 4; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx < 0 || ny < 0 || nx >= N || ny >= N)
                continue;

            if (!visited[nx][ny] && sameColor(color, map[nx][ny])) {
                dfsBlind(nx, ny, color);
            }
        }
    }

    // 색약에서의 색 비교
    static boolean sameColor(char a, char b) {
        // R과 G는 같다고 본다
        if ((a == 'R' || a == 'G') && (b == 'R' || b == 'G'))
            return true;
        return a == b;
    }
}
