import java.io.*;
import java.util.*;

public class Boj3197 {

    static int R, C;
    static char[][] map;

    static boolean[][] swanVisited;
    static boolean[][] waterVisited;

    static int[] dx = { 1, -1, 0, 0 };
    static int[] dy = { 0, 0, 1, -1 };

    static Queue<int[]> waterQ = new LinkedList<>();
    static Queue<int[]> nextWaterQ = new LinkedList<>();

    static Queue<int[]> swanQ = new LinkedList<>();
    static Queue<int[]> nextSwanQ = new LinkedList<>();

    static int[] swan1;
    static int[] swan2;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        map = new char[R][C];
        swanVisited = new boolean[R][C];
        waterVisited = new boolean[R][C];

        int swanCount = 0;

        for (int i = 0; i < R; i++) {
            String line = br.readLine();
            while (line != null && line.length() == 0)
                line = br.readLine();
            while (line.length() < C)
                line += br.readLine();

            for (int j = 0; j < C; j++) {
                char c = line.charAt(j);

                if (c == 'L') {
                    if (swanCount == 0)
                        swan1 = new int[] { i, j };
                    else
                        swan2 = new int[] { i, j };
                    swanCount++;
                    c = '.';
                }

                map[i][j] = c;

                if (c == '.') {
                    waterQ.offer(new int[] { i, j });
                    waterVisited[i][j] = true;
                }
            }
        }

        swanQ.offer(swan1);
        swanVisited[swan1[0]][swan1[1]] = true;

        int day = 0;

        while (true) {
            if (moveSwan()) {
                System.out.println(day);
                return;
            }

            meltIce();

            swanQ = nextSwanQ;
            nextSwanQ = new LinkedList<>();

            waterQ = nextWaterQ;
            nextWaterQ = new LinkedList<>();

            day++;
        }
    }

    static boolean moveSwan() {
        while (!swanQ.isEmpty()) {
            int[] cur = swanQ.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (!check(nx, ny) || swanVisited[nx][ny])
                    continue;

                swanVisited[nx][ny] = true;

                if (nx == swan2[0] && ny == swan2[1])
                    return true;

                if (map[nx][ny] == 'X')
                    nextSwanQ.offer(new int[] { nx, ny });
                else
                    swanQ.offer(new int[] { nx, ny });
            }
        }
        return false;
    }

    static void meltIce() {
        while (!waterQ.isEmpty()) {
            int[] cur = waterQ.poll();
            int x = cur[0], y = cur[1];

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (!check(nx, ny) || waterVisited[nx][ny])
                    continue;

                if (map[nx][ny] == 'X') {
                    map[nx][ny] = '.';
                    nextWaterQ.offer(new int[] { nx, ny });
                } else {
                    waterQ.offer(new int[] { nx, ny });
                }

                waterVisited[nx][ny] = true;
            }
        }
    }

    static boolean check(int x, int y) {
        return x >= 0 && y >= 0 && x < R && y < C;
    }
}
