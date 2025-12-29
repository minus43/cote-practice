import java.io.*;

public class Boj14568 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;
        if (n < 5) {
            System.out.println(0);
        } else {
            for (int i = 1; i * 2 <= n - 3; i++) {
                for (int o = 1; o < n - 2 * i; o++) {
                    if (n - 2 * i - o >= o + 2) {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

    }
}
