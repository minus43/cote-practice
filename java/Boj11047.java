import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj11047 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int count = 0;
        List<Integer> coins = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            coins.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(coins, Collections.reverseOrder());

        for (int coin : coins) {
            if (k == 0) {
                break;
            } else if (coin <= k) {
                int quotient = (int) Math.ceil(k / coin);
                count += quotient;
                k -= quotient * coin;
            } else {
                continue;
            }
        }
        System.out.println(count);
    }
}
