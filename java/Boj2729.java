import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj2729 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger a = new BigInteger(st.nextToken(), 2);
            BigInteger b = new BigInteger(st.nextToken(), 2);
            result.add(a.add(b).toString(2));
        }
        result.forEach(el -> System.out.println(el));
    }
}
