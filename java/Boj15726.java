import java.io.*;
import java.util.StringTokenizer;

public class Boj15726 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        double x = (double) a / b * c;
        double y = (double) a * b / c;

        long result = (long) Math.max(x, y);
        System.out.println(result);

    }
}
