import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj16953 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 1;
        List<Integer> list = new ArrayList<>();

        list.add(a);
        while (b > a) {
            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0) {
                b /= 2;
            } else {
                System.out.println(-1);
                return;
            }
            count++;
        }

        if (b == a) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}
