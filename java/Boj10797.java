import java.io.*;
import java.util.StringTokenizer;

public class Boj10797 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String day = br.readLine().trim();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;

        while (st.hasMoreTokens()) {
            if (day.equals(st.nextToken())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
