import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj16428 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());

        BigInteger[] dr = a.divideAndRemainder(b);
        BigInteger q = dr[0];
        BigInteger r = dr[1];

        if (r.signum() < 0) {
            BigInteger absB = b.abs();
            r = r.add(absB);

            if (b.signum() > 0) {
                q = q.subtract(BigInteger.ONE);
            } else {
                q = q.add(BigInteger.ONE);
            }
        }

        System.out.println(q);
        System.out.println(r);
    }
}
