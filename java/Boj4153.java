import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj4153 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new ArrayList<>();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if (a == 0) {
                break;
            }
            if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                result.add("right");
            } else if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
                result.add("right");
            } else if (Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2)) {
                result.add("right");
            } else {
                result.add("wrong");
            }

        }
        result.forEach(el -> System.out.println(el));
    }
}
