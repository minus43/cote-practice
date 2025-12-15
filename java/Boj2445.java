import java.io.*;

public class Boj2445 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n * 2 - 1; i++) {
            int p = i;
            if (i >= n) {
                p = n * 2 - 2 - i;
            }
            for (int o = 0; o < p + 1; o++) {
                System.out.print("*");
            }
            for (int o = 0; o < (n - (p + 1)) * 2; o++) {
                System.out.print(" ");
            }
            for (int o = 0; o < p + 1; o++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
