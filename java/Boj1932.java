import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj1932 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] tri = new int[n][n + 2];
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int o = 1;
            while (st.hasMoreTokens()) {
                int cur = Integer.parseInt(st.nextToken());
                if (i >= 1) {
                    tri[i][o] = Math.max(tri[i - 1][o - 1] + cur, tri[i - 1][o] + cur);
                } else {
                    tri[i][o] = cur;
                }
                o++;
            }
        }

        System.out.println(Arrays.stream(tri[n - 1]).max().getAsInt());

    }
}
