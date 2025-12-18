import java.io.*;

public class Boj11908 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int total = 0;
        int max = 0;
        String[] c = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(c[i]);
            max = Math.max(max, Integer.parseInt(c[i]));
        }

        System.out.println(total - max);
    }
}
