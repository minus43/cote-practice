import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj9465 {
    static int[][] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> result = new ArrayList<>();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[2][n];
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int o = 0; o < n; o++) {
                arr[0][o] = Integer.parseInt(st1.nextToken());
                arr[1][o] = Integer.parseInt(st2.nextToken());
            }

            int[][] dp = new int[2][n];
            dp[0][0] = arr[0][0];
            dp[1][0] = arr[1][0];
            if (n == 1) {
                result.add(Math.max(arr[0][0], arr[1][0]));
                continue;
            }
            dp[0][1] = dp[1][0] + arr[0][1];
            dp[1][1] = dp[0][0] + arr[1][1];

            for (int o = 2; o < n; o++) {
                dp[0][o] = Math.max(dp[1][o - 1], dp[1][o - 2]) + arr[0][o];
                dp[1][o] = Math.max(dp[0][o - 1], dp[0][o - 2]) + arr[1][o];
            }

            result.add(Math.max(dp[0][n - 1], dp[1][n - 1]));
        }
        result.forEach(el -> System.out.println(el));

    }
}
