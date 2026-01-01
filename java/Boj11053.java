import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj11053 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            for (int o = i - 1; o >= 0; o--) {
                if (arr[i] > arr[o]) {
                    dp[i] = Math.max(dp[i], dp[o]);
                }
            }
            dp[i]++;
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
