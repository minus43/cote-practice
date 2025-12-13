import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj26546 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int start = Integer.parseInt(input[1]);
            int end = Integer.parseInt(input[2]);
            StringBuilder sb = new StringBuilder();
            for (int o = 0; o < input[0].length(); o++) {
                if (o < start || o >= end) {
                    sb.append(input[0].charAt(o));
                }
            }
            result.add(sb.toString());
        }
        result.forEach(el -> System.out.println(el));
    }
}
