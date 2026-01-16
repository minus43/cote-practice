import java.io.*;
import java.util.StringTokenizer;

public class Boj33884 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long x1 = 0;
        long y1 = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 += Long.parseLong(st.nextToken());
            y1 += Long.parseLong(st.nextToken());
        }

        long x2 = 0;
        long y2 = 0;
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x2 += Long.parseLong(st.nextToken());
            y2 += Long.parseLong(st.nextToken());
        }
        System.out.println((x2 - x1) / n + " " + (y2 - y1) / n);
    }
}
