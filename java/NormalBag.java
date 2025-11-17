import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class NormalBag {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer nk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(nk.nextToken());
        int k = Integer.parseInt(nk.nextToken());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer wv = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(wv.nextToken());
            arr[i][1] = Integer.parseInt(wv.nextToken());
        }

        int[] dp = new int[k + 1];

        for (int[] wvs : arr) {
            int weight = wvs[0];
            int value = wvs[1];

            for (int i = k; i >= weight; i--) {
                dp[i] = Math.max(dp[i], dp[i - weight] + value);
            }
        }

        System.out.println(dp[k]);

    }

}