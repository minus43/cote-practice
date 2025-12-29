import java.io.*;

public class Boj2444 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int len = 2 * n - 1;

        for (int i = 1; i < len + 1; i++) {
            int base = 2 * i - 1;
            if (base > len) {
                base = len * 2 - base;
            }
            for (int o = 0; o < (len - base) / 2; o++) {
                System.out.print(" ");
            }
            for (int p = 0; p < base; p++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
