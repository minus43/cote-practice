import java.io.*;
import java.util.StringTokenizer;

public class Boj1629 {
    static long a, b, c;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Long.parseLong(st.nextToken());
        b = Long.parseLong(st.nextToken());
        c = Long.parseLong(st.nextToken());

        System.out.println(pow(a, b));
    }

    static long pow(long x, long exp) {
        if (exp == 0)
            return 1;

        long half = pow(x, exp / 2) % c;

        if (exp % 2 == 0) {
            return (half * half) % c;
        } else {
            return (half * half % c) * x % c;
        }
    }
}
