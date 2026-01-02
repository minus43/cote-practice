import java.io.*;
import java.util.StringTokenizer;

public class Boj17576 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int start = 0;
        int length = 0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            start += Integer.parseInt(st.nextToken());
            length = Integer.parseInt(st.nextToken());
        }

        s = s.substring(start, start + length);
        System.out.println(s);
    }
}
