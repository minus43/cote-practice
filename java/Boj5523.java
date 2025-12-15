import java.io.*;

public class Boj5523 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            String[] result = br.readLine().split(" ");
            int aSocre = Integer.parseInt(result[0]);
            int bSocre = Integer.parseInt(result[1]);
            if (aSocre > bSocre) {
                a++;
            } else if (bSocre > aSocre) {
                b++;
            } else {
                continue;
            }
        }
        System.out.println(a + " " + b);

    }
}
