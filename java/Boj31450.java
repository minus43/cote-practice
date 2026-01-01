import java.io.*;
import java.util.StringTokenizer;

public class Boj31450 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (m % k == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
