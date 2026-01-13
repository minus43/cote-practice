import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11660 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<Integer> result = new ArrayList<>();

        int[][] psum = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                int v = Integer.parseInt(st1.nextToken());
                psum[i][j] = psum[i - 1][j]
                        + psum[i][j - 1]
                        - psum[i - 1][j - 1]
                        + v;
            }
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st1.nextToken());
            int y1 = Integer.parseInt(st1.nextToken());
            int x2 = Integer.parseInt(st1.nextToken());
            int y2 = Integer.parseInt(st1.nextToken());

            int sum = psum[x2][y2]
                    - psum[x1 - 1][y2]
                    - psum[x2][y1 - 1]
                    + psum[x1 - 1][y1 - 1];

            result.add(sum);
        }
        result.forEach(el -> System.out.println(el));

    }
}
